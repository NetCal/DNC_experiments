/*
 * This file is part of the Deterministic Network Calculator (DNC).
 *
 * Copyright (C) 2019+ The DNC contributors
 *
 * http://networkcalculus.org
 *
 *
 * The Deterministic Network Calculator (DNC) is free software;
 * you can redistribute it and/or modify it under the terms of the 
 * GNU Lesser General Public License as published by the Free Software Foundation; 
 * either version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 */

package org.networkcalculus.dnc.experiments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.LinkedList;

import org.networkcalculus.dnc.AnalysisConfig;
import org.networkcalculus.dnc.AnalysisConfig.ArrivalBoundMethod;
import org.networkcalculus.dnc.AnalysisConfig.MaxScEnforcement;
import org.networkcalculus.dnc.AnalysisConfig.MultiplexingEnforcement;
import org.networkcalculus.dnc.experiments.pomacs2017servergraphs.PomacsServerGraphs;
import org.networkcalculus.dnc.network.server_graph.Flow;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;
import org.networkcalculus.dnc.tandem.analyses.TandemMatchingAnalysis;

public class ConvTest {
	private ServerGraph server_graph;

	private static String file_suffix = ".txt";

	public static void main(String[] args) {
		try {
			String dir = System.getProperty("user.dir") + "/src/experiments/convtest2019results/";
			dir = dir.trim();
			if (dir.charAt(dir.length() - 1) != '/') {
				dir += "/";
			}

			LinkedList<Integer> num_net_devices = new LinkedList<Integer>(
					Arrays.asList(
						      20,  40,  60,  80, 
						100, 120, 140, 160, 180, 
						200, 220, 240, 260, 280, 
						300, 400, 500, 
						1000
				));

			for (int devices : num_net_devices) {
				try {
					new ConvTest(dir, devices);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ConvTest(String input_output_path, int num_net_devices) throws Exception {
		server_graph = PomacsServerGraphs.getServerGraph(num_net_devices);
		
		AnalysisConfig base_config = new AnalysisConfig();
		base_config.enforceMaxSC( MaxScEnforcement.GLOBALLY_OFF );
		base_config.enforceMaxScOutputRate( MaxScEnforcement.GLOBALLY_OFF );
		base_config.enforceMultiplexing( MultiplexingEnforcement.GLOBAL_ARBITRARY );
		base_config.setArrivalBoundMethod( ArrivalBoundMethod.AGGR_TM );
		
		AnalysisConfig tma_conv_config = base_config.copy();
		tma_conv_config.setConvolveAlternativeArrivalBounds( true );
		tma_conv_config.setUseArrivalBoundsCache( false );
		TandemMatchingAnalysis tma_conv = new TandemMatchingAnalysis( server_graph, tma_conv_config );

		AnalysisConfig tma_cache_config = base_config.copy();
		tma_cache_config.setConvolveAlternativeArrivalBounds( false );
		tma_cache_config.setUseArrivalBoundsCache( true );
		TandemMatchingAnalysis tma_cache = new TandemMatchingAnalysis( server_graph, tma_cache_config );
		
		long t_start_solving, t_stop_solving;

		String flowIdstr;

		File delay_file = new File(input_output_path + Integer.toString(num_net_devices) + "_delay" + file_suffix);
		Writer delay_writer = new OutputStreamWriter(new FileOutputStream(delay_file), "UTF-8");
		PrintWriter delay_pw = new PrintWriter(delay_writer);

		delay_pw.println("Fid, TMA_conv_D, TMA_cache_D, Sanity");
		delay_pw.flush();

		File execT_file = new File(input_output_path + Integer.toString(num_net_devices) + "_execT" + file_suffix);
		Writer execT_writer = new OutputStreamWriter(new FileOutputStream(execT_file), "UTF-8");
		PrintWriter execT_pw = new PrintWriter(execT_writer);

		execT_pw.println("Fid, TMA_conv_T, TMA_cache_T");
		execT_pw.flush();
		
		/*
		 *  Note the following:
		 *  The arrival bounds cache is not cleared between analyses and therefore 
		 *  there will be interactions between tma_cache and tma_conv_cache via the cache.
		 *  Yet, tma_conv_cache will only reuse a cached arrival bound from tma_cache if
		 *  it is a singe, unique one for this location and flow/s.
		 *  That also means tma_conv_cache will replace the cache entries of tma_cache. 
		 *  Vice versa, tma_cache does not care about the amount of arrival bounds in the cache
		 *  and will thus reuse everything put into the cache by tma_conv_cache. 
		 */
		boolean sanity_equal_bounds;
		for (Flow flow_of_interest : server_graph.getFlows()) {
			// invariant IDs are encoded in the alias;
			// newly assigned IDs depend on the order of addition of flows to the server graph.
			flowIdstr = flow_of_interest.getAlias().substring(1);

			delay_pw.print(flowIdstr + ", ");
			delay_pw.flush();
			execT_pw.print(flowIdstr + ", ");
			execT_pw.flush();
			
			
			// TMA_conv
			t_start_solving = System.nanoTime();
			tma_conv.performAnalysis(flow_of_interest);
			t_stop_solving = System.nanoTime();

			delay_pw.print(tma_conv.getDelayBound().toString());
			delay_pw.print(", ");
			delay_pw.flush();

			execT_pw.print(t_stop_solving - t_start_solving);
			execT_pw.print(", ");
			execT_pw.flush();
			
			
			// TMA_cache
			t_start_solving = System.nanoTime();
			tma_cache.performAnalysis(flow_of_interest);
			t_stop_solving = System.nanoTime();

			delay_pw.print(tma_cache.getDelayBound().toString());
			delay_pw.print(", ");
			delay_pw.flush();

			execT_pw.print(t_stop_solving - t_start_solving);
			execT_pw.flush();
			
			
			// Delay Bound Sanity
			sanity_equal_bounds = tma_conv.getDelayBound().eq(tma_cache.getDelayBound());

			delay_pw.print(Boolean.toString(sanity_equal_bounds));
			delay_pw.println();
			delay_pw.flush();

			execT_pw.println();
			execT_pw.flush();
		}

		delay_pw.close();
		execT_pw.close();
	}
}
