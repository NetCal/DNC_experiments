/*
 * This file is part of the Disco Deterministic Network Calculator.
 *
 * Copyright (C) 2015 - 2018 Steffen Bondorf
 * Copyright (C) 2018+ The DiscoDNC contributors
 *
 * Distributed Computer Systems (DISCO) Lab
 * University of Kaiserslautern, Germany
 *
 * http://discodnc.cs.uni-kl.de
 *
 *
 * The Disco Deterministic Network Calculator (DiscoDNC) is free software;
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

package de.uni_kl.cs.discodnc.experiments;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.LinkedList;

import de.uni_kl.cs.discodnc.experiments.pomacs2017networks.*;
import de.uni_kl.cs.discodnc.nc.CompFFApresets;
import de.uni_kl.cs.discodnc.network.Flow;
import de.uni_kl.cs.discodnc.network.Network;

public class Pomacs2017 {

	private Network server_graph;

	private static String file_suffix = ".txt";

	public static void main(String[] args) {

		String dir = "";
		try {
			dir = System.getProperty("user.dir") + 
					"/src/main/java/de/uni_kl/cs/discodnc/experiments/pomacs2017results/";
			dir = dir.trim();
			if (dir.charAt(dir.length() - 1) != '/') {
				dir += "/";
			}

			LinkedList<Integer> num_net_devices = new LinkedList<Integer>(
					Arrays.asList(20, 40 //, 60, 80, 100, 120, 140, 160, 180, 200, 220, 240, 260, 280, 300, 400, 500, 1000
					));

			for (int devices : num_net_devices) {
				try {
					new Pomacs2017(dir, devices);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@SuppressWarnings("static-access")
	public Pomacs2017(String input_output_path, int num_net_devices) throws Exception {
		// Get the server graph
		// See package de.uni_kl.cs.discodnc.experiments.pomacs2017networks
		switch (num_net_devices) {
		case 20:
			server_graph = (new GLP20_ServerGraph()).network;
			break;
		case 40:
			server_graph = (new GLP40_ServerGraph()).network;
			break;
		case 60:
			server_graph = (new GLP60_ServerGraph()).network;
			break;
		case 80:
			server_graph = (new GLP80_ServerGraph()).network;
			break;
		case 100:
			server_graph = (new GLP100_ServerGraph()).network;
			break;
		case 120:
			server_graph = (new GLP120_ServerGraph()).network;
			break;
		case 140:
			server_graph = (new GLP140_ServerGraph()).network;
			break;
		case 160:
			server_graph = (new GLP160_ServerGraph()).network;
			break;
		case 180:
			server_graph = (new GLP180_ServerGraph()).network;
			break;
		case 200:
			server_graph = (new GLP200_ServerGraph()).network;
			break;
		case 220:
			server_graph = (new GLP220_ServerGraph()).network;
			break;
		case 240:
			server_graph = (new GLP240_ServerGraph()).network;
			break;
		case 260:
			server_graph = (new GLP260_ServerGraph()).network;
			break;
		case 280:
			server_graph = (new GLP280_ServerGraph()).network;
			break;
		case 300:
			server_graph = (new GLP300_ServerGraph()).network;
			break;
		case 400:
			server_graph = (new GLP400_ServerGraph()).network;
			break;
		case 500:
			server_graph = (new GLP500_ServerGraph()).network;
			break;
		case 1000:
			server_graph = (new GLP1000_ServerGraph()).network;
			break;

		default:
			System.out.println("Invalid number of network devices: " + Integer.toString(num_net_devices));
			System.exit(0);
		}

		CompFFApresets analyses = new CompFFApresets(server_graph);

		long t_start_solving, t_stop_solving;

		String flowIdstr;

		File delay_file = new File(input_output_path + Integer.toString(num_net_devices) + "_delay" + file_suffix);
		Writer delay_writer = new OutputStreamWriter(new FileOutputStream(delay_file), "UTF-8");
		PrintWriter delay_pw = new PrintWriter(delay_writer);

		delay_pw.println("Fid, TFA_D, SFA_D, PMOO_D");
		delay_pw.flush();

		File execT_file = new File(input_output_path + Integer.toString(num_net_devices) + "_execT" + file_suffix);
		Writer execT_writer = new OutputStreamWriter(new FileOutputStream(execT_file), "UTF-8");
		PrintWriter execT_pw = new PrintWriter(execT_writer);

		execT_pw.println("Fid, TFA_T, SFA_T, PMOO_T");
		execT_pw.flush();

		for (Flow flow_of_interest : server_graph.getFlows()) {
			// invariant IDs are encoded in the alias;
			// newly assigned IDs depend on the order of addition of flows to the server graph.
			flowIdstr = flow_of_interest.getAlias().substring(1);

			delay_pw.print(flowIdstr + ", ");
			delay_pw.flush();
			execT_pw.print(flowIdstr + ", ");
			execT_pw.flush();

			// TFA + aggrPBOOAB
			t_start_solving = System.nanoTime();
			analyses.tf_analysis.performAnalysis(flow_of_interest);
			t_stop_solving = System.nanoTime();

			delay_pw.print(analyses.tf_analysis.getDelayBound().toString());
			delay_pw.print(", ");
			delay_pw.flush();

			execT_pw.print(t_stop_solving - t_start_solving);
			execT_pw.print(", ");
			execT_pw.flush();

			// SFA + aggrPBOOAB
			t_start_solving = System.nanoTime();
			analyses.sf_analysis.performAnalysis(flow_of_interest);
			t_stop_solving = System.nanoTime();

			delay_pw.print(analyses.sf_analysis.getDelayBound().toString());
			delay_pw.print(", ");
			delay_pw.flush();

			execT_pw.print(t_stop_solving - t_start_solving);
			execT_pw.print(", ");
			execT_pw.flush();

			// PMOO + aggrPMOOAB
			t_start_solving = System.nanoTime();
			analyses.pmoo_analysis.performAnalysis(flow_of_interest);
			t_stop_solving = System.nanoTime();

			delay_pw.print(analyses.pmoo_analysis.getDelayBound().toString());
			delay_pw.println();
			delay_pw.flush();

			execT_pw.print(t_stop_solving - t_start_solving);
			execT_pw.println();
			execT_pw.flush();
		}

		delay_pw.close();
		execT_pw.close();
	}
}
