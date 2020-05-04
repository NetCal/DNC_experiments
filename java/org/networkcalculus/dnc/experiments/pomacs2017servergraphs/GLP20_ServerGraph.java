/*
 * This file is part of the Deterministic Network Calculator (DNC).
 *
 * Copyright (C) 2015 - 2018 Steffen Bondorf
 * Copyright (C) 2018 The DiscoDNC contributors
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

package org.networkcalculus.dnc.experiments.pomacs2017servergraphs;

import java.util.LinkedList;

import org.networkcalculus.dnc.AnalysisConfig.Multiplexing;
import org.networkcalculus.dnc.curves.Curve;
import org.networkcalculus.dnc.curves.CurveFactory_Affine;
import org.networkcalculus.dnc.network.server_graph.Server;
import org.networkcalculus.dnc.network.server_graph.ServerGraph;

public class GLP20_ServerGraph{
	public static ServerGraph server_graph;
	private static Server[] servers;
	private static CurveFactory_Affine factory = Curve.getFactory();
	
	public static void createServers1() throws Exception {
		servers[34] = server_graph.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[11] = server_graph.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[29] = server_graph.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[31] = server_graph.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[30] = server_graph.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[18] = server_graph.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[28] = server_graph.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[2] = server_graph.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[37] = server_graph.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[16] = server_graph.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[19] = server_graph.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[32] = server_graph.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[15] = server_graph.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[9] = server_graph.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[23] = server_graph.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[10] = server_graph.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[25] = server_graph.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[17] = server_graph.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[0] = server_graph.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[13] = server_graph.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[7] = server_graph.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[4] = server_graph.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[8] = server_graph.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[27] = server_graph.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[21] = server_graph.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[3] = server_graph.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[36] = server_graph.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[12] = server_graph.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[35] = server_graph.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[26] = server_graph.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[24] = server_graph.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[33] = server_graph.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[14] = server_graph.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[6] = server_graph.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[5] = server_graph.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[22] = server_graph.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[20] = server_graph.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[1] = server_graph.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
	}

	public static void createLinks1() throws Exception {
		server_graph.addTurn( "t19", servers[14], servers[0] );
		server_graph.addTurn( "t13", servers[11], servers[28] );
		server_graph.addTurn( "t26", servers[9], servers[3] );
		server_graph.addTurn( "t9", servers[25], servers[12] );
		server_graph.addTurn( "t23", servers[3], servers[31] );
		server_graph.addTurn( "t10", servers[13], servers[22] );
		server_graph.addTurn( "t18", servers[16], servers[21] );
		server_graph.addTurn( "t45", servers[31], servers[23] );
		server_graph.addTurn( "t11", servers[13], servers[23] );
		server_graph.addTurn( "t39", servers[29], servers[35] );
		server_graph.addTurn( "t51", servers[36], servers[9] );
		server_graph.addTurn( "t7", servers[21], servers[8] );
		server_graph.addTurn( "t40", servers[29], servers[36] );
		server_graph.addTurn( "t27", servers[4], servers[6] );
		server_graph.addTurn( "t30", servers[19], servers[1] );
		server_graph.addTurn( "t24", servers[3], servers[33] );
		server_graph.addTurn( "t50", servers[36], servers[7] );
		server_graph.addTurn( "t35", servers[18], servers[25] );
		server_graph.addTurn( "t36", servers[10], servers[29] );
		server_graph.addTurn( "t4", servers[7], servers[19] );
		server_graph.addTurn( "t8", servers[21], servers[9] );
		server_graph.addTurn( "t14", servers[2], servers[22] );
		server_graph.addTurn( "t52", servers[28], servers[14] );
		server_graph.addTurn( "t33", servers[18], servers[23] );
		server_graph.addTurn( "t5", servers[7], servers[20] );
		server_graph.addTurn( "t22", servers[37], servers[36] );
		server_graph.addTurn( "t53", servers[15], servers[27] );
		server_graph.addTurn( "t28", servers[4], servers[7] );
		server_graph.addTurn( "t46", servers[31], servers[25] );
		server_graph.addTurn( "t3", servers[5], servers[13] );
		server_graph.addTurn( "t16", servers[2], servers[25] );
		server_graph.addTurn( "t44", servers[31], servers[22] );
		server_graph.addTurn( "t32", servers[0], servers[21] );
		server_graph.addTurn( "t42", servers[24], servers[32] );
		server_graph.addTurn( "t29", servers[4], servers[8] );
		server_graph.addTurn( "t2", servers[17], servers[9] );
		server_graph.addTurn( "t41", servers[34], servers[30] );
		server_graph.addTurn( "t6", servers[21], servers[6] );
		server_graph.addTurn( "t20", servers[1], servers[15] );
		server_graph.addTurn( "t43", servers[24], servers[33] );
		server_graph.addTurn( "t12", servers[13], servers[24] );
		server_graph.addTurn( "t0", servers[17], servers[7] );
		server_graph.addTurn( "t48", servers[8], servers[35] );
		server_graph.addTurn( "t15", servers[2], servers[24] );
		server_graph.addTurn( "t38", servers[26], servers[32] );
		server_graph.addTurn( "t25", servers[32], servers[4] );
		server_graph.addTurn( "t47", servers[8], servers[34] );
		server_graph.addTurn( "t21", servers[37], servers[34] );
		server_graph.addTurn( "t34", servers[18], servers[24] );
		server_graph.addTurn( "t37", servers[26], servers[31] );
		server_graph.addTurn( "t49", servers[36], servers[6] );
		server_graph.addTurn( "t17", servers[16], servers[19] );
		server_graph.addTurn( "t1", servers[17], servers[8] );
		server_graph.addTurn( "t31", servers[0], servers[20] );
	}

	public static void createFlows1() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		server_graph.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		server_graph.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		server_graph.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		server_graph.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		server_graph.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		server_graph.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		server_graph.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		server_graph.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		server_graph.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		server_graph.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		server_graph.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		server_graph.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows2() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[24] );
		server_graph.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		server_graph.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		server_graph.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		server_graph.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		server_graph.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		server_graph.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		server_graph.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		server_graph.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		server_graph.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		server_graph.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		server_graph.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		server_graph.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		server_graph.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		server_graph.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		server_graph.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		server_graph.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		server_graph.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		server_graph.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		server_graph.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		server_graph.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		server_graph.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		server_graph.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		server_graph.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows3() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		server_graph.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		server_graph.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		server_graph.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		server_graph.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		server_graph.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		server_graph.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	private GLP20_ServerGraph() {
	    
	}
	
	static {
		try{
			servers = new Server[38];
			server_graph = new ServerGraph();
			createServers1();
			createLinks1();
			createFlows1();
			createFlows2();
			createFlows3();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

