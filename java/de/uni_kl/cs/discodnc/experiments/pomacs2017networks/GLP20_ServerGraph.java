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

package de.uni_kl.cs.discodnc.experiments.pomacs2017networks;

import java.util.LinkedList;

import de.uni_kl.cs.discodnc.curves.Curve;
import de.uni_kl.cs.discodnc.feedforward.AnalysisConfig.Multiplexing;
import de.uni_kl.cs.discodnc.network.Network;
import de.uni_kl.cs.discodnc.network.Server;

public class GLP20_ServerGraph{
	public static Network network;
	private static Server[] servers;
	private static Curve factory = Curve.getFactory();
	
	public static void createServers1() throws Exception {
		servers[34] = network.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[11] = network.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[29] = network.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[31] = network.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[30] = network.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[18] = network.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[28] = network.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[2] = network.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[37] = network.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[16] = network.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[19] = network.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[32] = network.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[15] = network.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[9] = network.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[23] = network.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[10] = network.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[25] = network.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[17] = network.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[0] = network.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[13] = network.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[7] = network.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[4] = network.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[8] = network.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[27] = network.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[21] = network.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[3] = network.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[36] = network.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[12] = network.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[35] = network.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[26] = network.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[24] = network.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[33] = network.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[14] = network.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[6] = network.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[5] = network.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[22] = network.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[20] = network.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[1] = network.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
	}

	public static void createLinks1() throws Exception {
		network.addLink( "l19", servers[14], servers[0] );
		network.addLink( "l13", servers[11], servers[28] );
		network.addLink( "l26", servers[9], servers[3] );
		network.addLink( "l9", servers[25], servers[12] );
		network.addLink( "l23", servers[3], servers[31] );
		network.addLink( "l10", servers[13], servers[22] );
		network.addLink( "l18", servers[16], servers[21] );
		network.addLink( "l45", servers[31], servers[23] );
		network.addLink( "l11", servers[13], servers[23] );
		network.addLink( "l39", servers[29], servers[35] );
		network.addLink( "l51", servers[36], servers[9] );
		network.addLink( "l7", servers[21], servers[8] );
		network.addLink( "l40", servers[29], servers[36] );
		network.addLink( "l27", servers[4], servers[6] );
		network.addLink( "l30", servers[19], servers[1] );
		network.addLink( "l24", servers[3], servers[33] );
		network.addLink( "l50", servers[36], servers[7] );
		network.addLink( "l35", servers[18], servers[25] );
		network.addLink( "l36", servers[10], servers[29] );
		network.addLink( "l4", servers[7], servers[19] );
		network.addLink( "l8", servers[21], servers[9] );
		network.addLink( "l14", servers[2], servers[22] );
		network.addLink( "l52", servers[28], servers[14] );
		network.addLink( "l33", servers[18], servers[23] );
		network.addLink( "l5", servers[7], servers[20] );
		network.addLink( "l22", servers[37], servers[36] );
		network.addLink( "l53", servers[15], servers[27] );
		network.addLink( "l28", servers[4], servers[7] );
		network.addLink( "l46", servers[31], servers[25] );
		network.addLink( "l3", servers[5], servers[13] );
		network.addLink( "l16", servers[2], servers[25] );
		network.addLink( "l44", servers[31], servers[22] );
		network.addLink( "l32", servers[0], servers[21] );
		network.addLink( "l42", servers[24], servers[32] );
		network.addLink( "l29", servers[4], servers[8] );
		network.addLink( "l2", servers[17], servers[9] );
		network.addLink( "l41", servers[34], servers[30] );
		network.addLink( "l6", servers[21], servers[6] );
		network.addLink( "l20", servers[1], servers[15] );
		network.addLink( "l43", servers[24], servers[33] );
		network.addLink( "l12", servers[13], servers[24] );
		network.addLink( "l0", servers[17], servers[7] );
		network.addLink( "l48", servers[8], servers[35] );
		network.addLink( "l15", servers[2], servers[24] );
		network.addLink( "l38", servers[26], servers[32] );
		network.addLink( "l25", servers[32], servers[4] );
		network.addLink( "l47", servers[8], servers[34] );
		network.addLink( "l21", servers[37], servers[34] );
		network.addLink( "l34", servers[18], servers[24] );
		network.addLink( "l37", servers[26], servers[31] );
		network.addLink( "l49", servers[36], servers[6] );
		network.addLink( "l17", servers[16], servers[19] );
		network.addLink( "l1", servers[17], servers[8] );
		network.addLink( "l31", servers[0], servers[20] );
	}

	public static void createFlows1() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		network.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		network.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		network.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		network.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		network.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		network.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		network.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		network.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		network.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[19] );
		network.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		network.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		network.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows2() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[24] );
		network.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		network.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		network.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		network.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		network.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		network.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		network.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		network.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[16] );
		network.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		network.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		network.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		network.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		network.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[33] );
		network.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		network.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		network.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		servers_on_path_s.add( servers[1] );
		servers_on_path_s.add( servers[15] );
		network.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		network.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[29] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
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
		network.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[21] );
		network.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[19] );
		network.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[12] );
		network.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public GLP20_ServerGraph() {
		try{
			servers = new Server[38];
			network = new Network();
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

