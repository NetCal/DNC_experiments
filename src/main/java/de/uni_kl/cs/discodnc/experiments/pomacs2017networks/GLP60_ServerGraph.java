/*
 * This file is part of the Disco Deterministic Network Calculator.
 *
 * Copyright (C) 2015 - 2018 Steffen Bondorf
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
import de.uni_kl.cs.discodnc.nc.AnalysisConfig.Multiplexing;
import de.uni_kl.cs.discodnc.network.Network;
import de.uni_kl.cs.discodnc.network.Server;

public class GLP60_ServerGraph{
	public static Network network;
	private static Server[] servers;
	private static Curve factory = Curve.getFactory();
	
	public static void createServers1() throws Exception {
		servers[49] = network.addServer( "s49", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[11] = network.addServer( "s11", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[51] = network.addServer( "s51", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[61] = network.addServer( "s61", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[149] = network.addServer( "s149", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[108] = network.addServer( "s108", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[111] = network.addServer( "s111", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[89] = network.addServer( "s89", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[148] = network.addServer( "s148", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[65] = network.addServer( "s65", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[2] = network.addServer( "s2", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[86] = network.addServer( "s86", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[116] = network.addServer( "s116", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[56] = network.addServer( "s56", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[103] = network.addServer( "s103", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[78] = network.addServer( "s78", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[124] = network.addServer( "s124", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[133] = network.addServer( "s133", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[161] = network.addServer( "s161", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[130] = network.addServer( "s130", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[38] = network.addServer( "s38", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[82] = network.addServer( "s82", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[93] = network.addServer( "s93", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[107] = network.addServer( "s107", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[20] = network.addServer( "s20", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[71] = network.addServer( "s71", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[137] = network.addServer( "s137", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[156] = network.addServer( "s156", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[81] = network.addServer( "s81", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[35] = network.addServer( "s35", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[41] = network.addServer( "s41", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[72] = network.addServer( "s72", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[40] = network.addServer( "s40", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[155] = network.addServer( "s155", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[31] = network.addServer( "s31", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[113] = network.addServer( "s113", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[12] = network.addServer( "s12", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[63] = network.addServer( "s63", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[28] = network.addServer( "s28", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[19] = network.addServer( "s19", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[154] = network.addServer( "s154", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[46] = network.addServer( "s46", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[106] = network.addServer( "s106", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[69] = network.addServer( "s69", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[79] = network.addServer( "s79", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[54] = network.addServer( "s54", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[33] = network.addServer( "s33", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[104] = network.addServer( "s104", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[144] = network.addServer( "s144", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[0] = network.addServer( "s0", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[55] = network.addServer( "s55", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[128] = network.addServer( "s128", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[64] = network.addServer( "s64", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[29] = network.addServer( "s29", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[4] = network.addServer( "s4", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[10] = network.addServer( "s10", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[68] = network.addServer( "s68", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[85] = network.addServer( "s85", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[57] = network.addServer( "s57", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[34] = network.addServer( "s34", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[150] = network.addServer( "s150", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[17] = network.addServer( "s17", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[132] = network.addServer( "s132", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[80] = network.addServer( "s80", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[24] = network.addServer( "s24", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[90] = network.addServer( "s90", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[15] = network.addServer( "s15", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[105] = network.addServer( "s105", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[162] = network.addServer( "s162", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[8] = network.addServer( "s8", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[62] = network.addServer( "s62", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[153] = network.addServer( "s153", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[121] = network.addServer( "s121", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[114] = network.addServer( "s114", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[3] = network.addServer( "s3", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[117] = network.addServer( "s117", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[110] = network.addServer( "s110", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[88] = network.addServer( "s88", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[87] = network.addServer( "s87", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[59] = network.addServer( "s59", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[125] = network.addServer( "s125", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[5] = network.addServer( "s5", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[146] = network.addServer( "s146", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[50] = network.addServer( "s50", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[151] = network.addServer( "s151", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[163] = network.addServer( "s163", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[18] = network.addServer( "s18", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[52] = network.addServer( "s52", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[109] = network.addServer( "s109", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[159] = network.addServer( "s159", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[91] = network.addServer( "s91", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[127] = network.addServer( "s127", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[102] = network.addServer( "s102", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[97] = network.addServer( "s97", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[98] = network.addServer( "s98", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[83] = network.addServer( "s83", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[36] = network.addServer( "s36", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[115] = network.addServer( "s115", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[22] = network.addServer( "s22", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[32] = network.addServer( "s32", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[43] = network.addServer( "s43", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[9] = network.addServer( "s9", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[73] = network.addServer( "s73", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[101] = network.addServer( "s101", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[120] = network.addServer( "s120", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[42] = network.addServer( "s42", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[94] = network.addServer( "s94", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[95] = network.addServer( "s95", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[23] = network.addServer( "s23", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[96] = network.addServer( "s96", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[118] = network.addServer( "s118", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[131] = network.addServer( "s131", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[67] = network.addServer( "s67", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[30] = network.addServer( "s30", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[27] = network.addServer( "s27", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[141] = network.addServer( "s141", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[1] = network.addServer( "s1", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[26] = network.addServer( "s26", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[66] = network.addServer( "s66", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[76] = network.addServer( "s76", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[123] = network.addServer( "s123", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[39] = network.addServer( "s39", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[25] = network.addServer( "s25", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[6] = network.addServer( "s6", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[139] = network.addServer( "s139", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[58] = network.addServer( "s58", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[140] = network.addServer( "s140", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[45] = network.addServer( "s45", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[13] = network.addServer( "s13", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[126] = network.addServer( "s126", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[152] = network.addServer( "s152", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[53] = network.addServer( "s53", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[143] = network.addServer( "s143", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[112] = network.addServer( "s112", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[74] = network.addServer( "s74", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[129] = network.addServer( "s129", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[77] = network.addServer( "s77", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[160] = network.addServer( "s160", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[14] = network.addServer( "s14", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[75] = network.addServer( "s75", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[21] = network.addServer( "s21", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[100] = network.addServer( "s100", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[158] = network.addServer( "s158", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[92] = network.addServer( "s92", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[134] = network.addServer( "s134", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[145] = network.addServer( "s145", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[147] = network.addServer( "s147", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[7] = network.addServer( "s7", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[119] = network.addServer( "s119", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[44] = network.addServer( "s44", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[84] = network.addServer( "s84", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[122] = network.addServer( "s122", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[142] = network.addServer( "s142", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[47] = network.addServer( "s47", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[16] = network.addServer( "s16", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[99] = network.addServer( "s99", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[37] = network.addServer( "s37", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[70] = network.addServer( "s70", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[60] = network.addServer( "s60", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[157] = network.addServer( "s157", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[48] = network.addServer( "s48", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[138] = network.addServer( "s138", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[136] = network.addServer( "s136", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
		servers[135] = network.addServer( "s135", factory.createServiceCurve( "SC{(0.0,0.0),10000.0}" ), factory.createMaxServiceCurve( "MSC{(0.0,0.0),0.0;!(0.0,Infinity),0.0}" ), Multiplexing.ARBITRARY, true, true );
	}

	public static void createLinks1() throws Exception {
		network.addLink( "l364", servers[5], servers[134] );
		network.addLink( "l653", servers[92], servers[40] );
		network.addLink( "l717", servers[155], servers[141] );
		network.addLink( "l49", servers[102], servers[19] );
		network.addLink( "l573", servers[8], servers[136] );
		network.addLink( "l456", servers[31], servers[102] );
		network.addLink( "l510", servers[124], servers[109] );
		network.addLink( "l726", servers[111], servers[108] );
		network.addLink( "l148", servers[158], servers[136] );
		network.addLink( "l120", servers[123], servers[34] );
		network.addLink( "l191", servers[40], servers[140] );
		network.addLink( "l263", servers[41], servers[95] );
		network.addLink( "l711", servers[155], servers[134] );
		network.addLink( "l90", servers[17], servers[29] );
		network.addLink( "l71", servers[115], servers[138] );
		network.addLink( "l511", servers[124], servers[110] );
		network.addLink( "l369", servers[5], servers[140] );
		network.addLink( "l592", servers[147], servers[78] );
		network.addLink( "l220", servers[37], servers[20] );
		network.addLink( "l448", servers[131], servers[153] );
		network.addLink( "l32", servers[62], servers[119] );
		network.addLink( "l555", servers[148], servers[141] );
		network.addLink( "l492", servers[156], servers[140] );
		network.addLink( "l274", servers[32], servers[62] );
		network.addLink( "l141", servers[88], servers[142] );
		network.addLink( "l61", servers[65], servers[105] );
		network.addLink( "l315", servers[9], servers[53] );
		network.addLink( "l336", servers[69], servers[17] );
		network.addLink( "l99", servers[28], servers[24] );
		network.addLink( "l245", servers[26], servers[125] );
		network.addLink( "l325", servers[50], servers[71] );
		network.addLink( "l669", servers[81], servers[23] );
		network.addLink( "l548", servers[148], servers[133] );
		network.addLink( "l341", servers[69], servers[23] );
		network.addLink( "l25", servers[121], servers[61] );
		network.addLink( "l344", servers[38], servers[159] );
		network.addLink( "l310", servers[52], servers[6] );
		network.addLink( "l348", servers[137], servers[34] );
		network.addLink( "l91", servers[17], servers[30] );
		network.addLink( "l21", servers[0], servers[23] );
		network.addLink( "l450", servers[31], servers[96] );
		network.addLink( "l720", servers[155], servers[144] );
		network.addLink( "l735", servers[20], servers[108] );
		network.addLink( "l171", servers[73], servers[43] );
		network.addLink( "l172", servers[73], servers[44] );
		network.addLink( "l493", servers[156], servers[141] );
		network.addLink( "l743", servers[107], servers[22] );
		network.addLink( "l360", servers[35], servers[143] );
		network.addLink( "l47", servers[102], servers[17] );
		network.addLink( "l545", servers[154], servers[160] );
		network.addLink( "l8", servers[157], servers[120] );
		network.addLink( "l225", servers[162], servers[28] );
		network.addLink( "l675", servers[55], servers[121] );
		network.addLink( "l706", servers[4], servers[46] );
		network.addLink( "l0", servers[82], servers[159] );
		network.addLink( "l634", servers[151], servers[116] );
		network.addLink( "l277", servers[32], servers[65] );
		network.addLink( "l221", servers[37], servers[21] );
		network.addLink( "l312", servers[52], servers[8] );
		network.addLink( "l13", servers[16], servers[1] );
		network.addLink( "l249", servers[27], servers[74] );
		network.addLink( "l434", servers[133], servers[77] );
		network.addLink( "l529", servers[42], servers[107] );
		network.addLink( "l522", servers[105], servers[45] );
		network.addLink( "l608", servers[128], servers[125] );
		network.addLink( "l222", servers[37], servers[22] );
		network.addLink( "l218", servers[37], servers[18] );
		network.addLink( "l619", servers[87], servers[134] );
		network.addLink( "l668", servers[81], servers[21] );
		network.addLink( "l387", servers[94], servers[76] );
		network.addLink( "l190", servers[40], servers[139] );
		network.addLink( "l183", servers[56], servers[102] );
		network.addLink( "l584", servers[144], servers[9] );
		network.addLink( "l169", servers[73], servers[41] );
		network.addLink( "l487", servers[156], servers[135] );
		network.addLink( "l702", servers[4], servers[41] );
		network.addLink( "l20", servers[0], servers[22] );
		network.addLink( "l736", servers[20], servers[109] );
		network.addLink( "l308", servers[126], servers[102] );
		network.addLink( "l685", servers[150], servers[65] );
		network.addLink( "l58", servers[110], servers[63] );
		network.addLink( "l498", servers[108], servers[117] );
		network.addLink( "l375", servers[72], servers[126] );
		network.addLink( "l535", servers[15], servers[42] );
		network.addLink( "l87", servers[10], servers[124] );
		network.addLink( "l399", servers[12], servers[77] );
		network.addLink( "l636", servers[151], servers[118] );
		network.addLink( "l291", servers[7], servers[42] );
		network.addLink( "l466", servers[57], servers[140] );
		network.addLink( "l484", servers[159], servers[115] );
		network.addLink( "l234", servers[146], servers[70] );
		network.addLink( "l623", servers[87], servers[139] );
		network.addLink( "l153", servers[158], servers[142] );
		network.addLink( "l423", servers[75], servers[137] );
		network.addLink( "l724", servers[111], servers[106] );
		network.addLink( "l45", servers[24], servers[103] );
		network.addLink( "l654", servers[92], servers[41] );
		network.addLink( "l599", servers[129], servers[110] );
		network.addLink( "l451", servers[31], servers[97] );
		network.addLink( "l144", servers[88], servers[145] );
		network.addLink( "l179", servers[56], servers[98] );
		network.addLink( "l583", servers[144], servers[7] );
		network.addLink( "l42", servers[24], servers[99] );
		network.addLink( "l483", servers[159], servers[114] );
		network.addLink( "l580", servers[8], servers[143] );
		network.addLink( "l192", servers[40], servers[141] );
		network.addLink( "l464", servers[57], servers[138] );
		network.addLink( "l113", servers[112], servers[0] );
		network.addLink( "l232", servers[146], servers[68] );
		network.addLink( "l577", servers[8], servers[140] );
		network.addLink( "l607", servers[128], servers[124] );
		network.addLink( "l609", servers[91], servers[150] );
		network.addLink( "l313", servers[9], servers[50] );
		network.addLink( "l372", servers[5], servers[143] );
		network.addLink( "l414", servers[93], servers[43] );
		network.addLink( "l488", servers[156], servers[136] );
		network.addLink( "l59", servers[110], servers[64] );
		network.addLink( "l94", servers[28], servers[19] );
		network.addLink( "l175", servers[73], servers[48] );
		network.addLink( "l370", servers[5], servers[141] );
		network.addLink( "l63", servers[65], servers[107] );
		network.addLink( "l174", servers[73], servers[47] );
		network.addLink( "l55", servers[110], servers[60] );
		network.addLink( "l185", servers[40], servers[133] );
		network.addLink( "l626", servers[87], servers[142] );
		network.addLink( "l151", servers[158], servers[139] );
		network.addLink( "l637", servers[151], servers[119] );
		network.addLink( "l480", servers[113], servers[161] );
		network.addLink( "l595", servers[129], servers[106] );
		network.addLink( "l83", servers[10], servers[120] );
		network.addLink( "l512", servers[54], servers[152] );
		network.addLink( "l526", servers[105], servers[49] );
		network.addLink( "l304", servers[126], servers[97] );
		network.addLink( "l135", servers[88], servers[135] );
		network.addLink( "l353", servers[35], servers[135] );
		network.addLink( "l627", servers[87], servers[143] );
		network.addLink( "l96", servers[28], servers[21] );
		network.addLink( "l730", servers[13], servers[8] );
		network.addLink( "l690", servers[90], servers[54] );
		network.addLink( "l661", servers[92], servers[49] );
		network.addLink( "l476", servers[132], servers[22] );
		network.addLink( "l161", servers[59], servers[71] );
		network.addLink( "l119", servers[83], servers[70] );
		network.addLink( "l66", servers[115], servers[133] );
		network.addLink( "l477", servers[132], servers[23] );
		network.addLink( "l4", servers[157], servers[116] );
		network.addLink( "l22", servers[0], servers[24] );
		network.addLink( "l253", servers[27], servers[79] );
		network.addLink( "l342", servers[69], servers[24] );
		network.addLink( "l721", servers[155], servers[145] );
		network.addLink( "l147", servers[158], servers[135] );
		network.addLink( "l482", servers[113], servers[163] );
		network.addLink( "l523", servers[105], servers[46] );
		network.addLink( "l279", servers[119], servers[86] );
		network.addLink( "l189", servers[40], servers[138] );
		network.addLink( "l18", servers[0], servers[20] );
		network.addLink( "l677", servers[55], servers[123] );
		network.addLink( "l329", servers[66], servers[54] );
		network.addLink( "l549", servers[148], servers[134] );
		network.addLink( "l201", servers[134], servers[45] );
		network.addLink( "l411", servers[93], servers[40] );
		network.addLink( "l146", servers[158], servers[134] );
		network.addLink( "l574", servers[8], servers[137] );
		network.addLink( "l651", servers[64], servers[52] );
		network.addLink( "l139", servers[88], servers[140] );
		network.addLink( "l500", servers[108], servers[119] );
		network.addLink( "l550", servers[148], servers[135] );
		network.addLink( "l37", servers[62], servers[125] );
		network.addLink( "l81", servers[10], servers[118] );
		network.addLink( "l70", servers[115], servers[137] );
		network.addLink( "l705", servers[4], servers[45] );
		network.addLink( "l525", servers[105], servers[48] );
		network.addLink( "l103", servers[100], servers[69] );
		network.addLink( "l320", servers[2], servers[85] );
		network.addLink( "l200", servers[134], servers[44] );
		network.addLink( "l707", servers[4], servers[47] );
		network.addLink( "l503", servers[108], servers[122] );
		network.addLink( "l78", servers[145], servers[113] );
		network.addLink( "l716", servers[155], servers[140] );
		network.addLink( "l732", servers[20], servers[104] );
		network.addLink( "l356", servers[35], servers[139] );
		network.addLink( "l235", servers[146], servers[71] );
		network.addLink( "l89", servers[17], servers[27] );
		network.addLink( "l108", servers[70], servers[98] );
		network.addLink( "l125", servers[36], servers[118] );
		network.addLink( "l256", servers[98], servers[43] );
		network.addLink( "l292", servers[7], servers[43] );
		network.addLink( "l658", servers[92], servers[45] );
		network.addLink( "l208", servers[39], servers[60] );
		network.addLink( "l324", servers[50], servers[70] );
		network.addLink( "l75", servers[115], servers[142] );
		network.addLink( "l176", servers[73], servers[49] );
		network.addLink( "l140", servers[88], servers[141] );
		network.addLink( "l257", servers[98], servers[44] );
		network.addLink( "l260", servers[98], servers[47] );
		network.addLink( "l396", servers[12], servers[74] );
		network.addLink( "l212", servers[39], servers[65] );
		network.addLink( "l224", servers[162], servers[27] );
		network.addLink( "l298", servers[45], servers[6] );
		network.addLink( "l365", servers[5], servers[135] );
		network.addLink( "l449", servers[131], servers[154] );
		network.addLink( "l44", servers[24], servers[101] );
		network.addLink( "l331", servers[18], servers[67] );
		network.addLink( "l275", servers[32], servers[63] );
		network.addLink( "l552", servers[148], servers[137] );
		network.addLink( "l517", servers[153], servers[53] );
		network.addLink( "l606", servers[128], servers[123] );
		network.addLink( "l17", servers[0], servers[19] );
		network.addLink( "l152", servers[158], servers[140] );
		network.addLink( "l621", servers[87], servers[137] );
		network.addLink( "l118", servers[83], servers[69] );
		network.addLink( "l205", servers[134], servers[49] );
		network.addLink( "l740", servers[107], servers[18] );
		network.addLink( "l145", servers[158], servers[133] );
		network.addLink( "l186", servers[40], servers[135] );
		network.addLink( "l657", servers[92], servers[44] );
		network.addLink( "l408", servers[89], servers[46] );
		network.addLink( "l29", servers[62], servers[116] );
		network.addLink( "l435", servers[133], servers[78] );
		network.addLink( "l672", servers[55], servers[117] );
		network.addLink( "l459", servers[57], servers[133] );
		network.addLink( "l648", servers[53], servers[65] );
		network.addLink( "l124", servers[36], servers[117] );
		network.addLink( "l382", servers[114], servers[101] );
		network.addLink( "l19", servers[0], servers[21] );
		network.addLink( "l219", servers[37], servers[19] );
		network.addLink( "l10", servers[157], servers[122] );
		network.addLink( "l598", servers[129], servers[109] );
		network.addLink( "l377", servers[114], servers[96] );
		network.addLink( "l252", servers[27], servers[78] );
		network.addLink( "l515", servers[153], servers[51] );
		network.addLink( "l641", servers[151], servers[124] );
		network.addLink( "l628", servers[87], servers[144] );
		network.addLink( "l354", servers[35], servers[136] );
		network.addLink( "l158", servers[59], servers[67] );
		network.addLink( "l622", servers[87], servers[138] );
		network.addLink( "l27", servers[121], servers[64] );
		network.addLink( "l82", servers[10], servers[119] );
		network.addLink( "l117", servers[83], servers[68] );
		network.addLink( "l264", servers[41], servers[96] );
		network.addLink( "l559", servers[148], servers[145] );
		network.addLink( "l409", servers[89], servers[48] );
		network.addLink( "l35", servers[62], servers[123] );
		network.addLink( "l373", servers[5], servers[144] );
		network.addLink( "l413", servers[93], servers[42] );
		network.addLink( "l558", servers[148], servers[144] );
		network.addLink( "l660", servers[92], servers[47] );
		network.addLink( "l102", servers[100], servers[68] );
		network.addLink( "l605", servers[128], servers[122] );
		network.addLink( "l572", servers[8], servers[135] );
		network.addLink( "l617", servers[14], servers[110] );
		network.addLink( "l688", servers[90], servers[52] );
		network.addLink( "l681", servers[150], servers[60] );
		network.addLink( "l591", servers[147], servers[77] );
		network.addLink( "l471", servers[132], servers[16] );
		network.addLink( "l68", servers[115], servers[135] );
		network.addLink( "l478", servers[132], servers[24] );
		network.addLink( "l576", servers[8], servers[139] );
		network.addLink( "l326", servers[66], servers[51] );
		network.addLink( "l594", servers[129], servers[105] );
		network.addLink( "l267", servers[41], servers[100] );
		network.addLink( "l272", servers[32], servers[59] );
		network.addLink( "l597", servers[129], servers[108] );
		network.addLink( "l650", servers[64], servers[51] );
		network.addLink( "l376", servers[114], servers[95] );
		network.addLink( "l556", servers[148], servers[142] );
		network.addLink( "l453", servers[31], servers[99] );
		network.addLink( "l530", servers[42], servers[108] );
		network.addLink( "l723", servers[111], servers[105] );
		network.addLink( "l38", servers[24], servers[95] );
		network.addLink( "l241", servers[26], servers[121] );
		network.addLink( "l100", servers[100], servers[66] );
		network.addLink( "l76", servers[115], servers[143] );
		network.addLink( "l231", servers[146], servers[66] );
		network.addLink( "l602", servers[128], servers[119] );
		network.addLink( "l708", servers[4], servers[48] );
		network.addLink( "l39", servers[24], servers[96] );
		network.addLink( "l92", servers[28], servers[16] );
		network.addLink( "l405", servers[89], servers[43] );
		network.addLink( "l727", servers[111], servers[110] );
		network.addLink( "l178", servers[56], servers[97] );
		network.addLink( "l337", servers[69], servers[19] );
		network.addLink( "l603", servers[128], servers[120] );
		network.addLink( "l689", servers[90], servers[53] );
		network.addLink( "l5", servers[157], servers[117] );
		network.addLink( "l395", servers[11], servers[79] );
		network.addLink( "l633", servers[33], servers[30] );
		network.addLink( "l710", servers[155], servers[133] );
		network.addLink( "l741", servers[107], servers[19] );
		network.addLink( "l400", servers[12], servers[79] );
		network.addLink( "l441", servers[80], servers[100] );
		network.addLink( "l207", servers[39], servers[59] );
		network.addLink( "l321", servers[50], servers[67] );
		network.addLink( "l680", servers[150], servers[59] );
		network.addLink( "l670", servers[81], servers[24] );
		network.addLink( "l590", servers[147], servers[76] );
		network.addLink( "l638", servers[151], servers[120] );
		network.addLink( "l514", servers[153], servers[50] );
		network.addLink( "l368", servers[5], servers[139] );
		network.addLink( "l318", servers[86], servers[1] );
		network.addLink( "l520", servers[105], servers[43] );
		network.addLink( "l150", servers[158], servers[138] );
		network.addLink( "l269", servers[41], servers[102] );
		network.addLink( "l494", servers[156], servers[142] );
		network.addLink( "l701", servers[4], servers[40] );
		network.addLink( "l467", servers[57], servers[141] );
		network.addLink( "l570", servers[8], servers[133] );
		network.addLink( "l273", servers[32], servers[61] );
		network.addLink( "l436", servers[133], servers[79] );
		network.addLink( "l566", servers[84], servers[20] );
		network.addLink( "l490", servers[156], servers[138] );
		network.addLink( "l485", servers[156], servers[133] );
		network.addLink( "l93", servers[28], servers[18] );
		network.addLink( "l294", servers[7], servers[46] );
		network.addLink( "l557", servers[148], servers[143] );
		network.addLink( "l429", servers[75], servers[143] );
		network.addLink( "l479", servers[113], servers[160] );
		network.addLink( "l352", servers[35], servers[134] );
		network.addLink( "l582", servers[144], servers[6] );
		network.addLink( "l508", servers[124], servers[106] );
		network.addLink( "l210", servers[39], servers[62] );
		network.addLink( "l137", servers[88], servers[137] );
		network.addLink( "l406", servers[89], servers[44] );
		network.addLink( "l2", servers[82], servers[162] );
		network.addLink( "l180", servers[56], servers[99] );
		network.addLink( "l581", servers[8], servers[145] );
		network.addLink( "l664", servers[81], servers[17] );
		network.addLink( "l276", servers[32], servers[64] );
		network.addLink( "l665", servers[81], servers[18] );
		network.addLink( "l296", servers[7], servers[48] );
		network.addLink( "l196", servers[40], servers[145] );
		network.addLink( "l639", servers[151], servers[121] );
		network.addLink( "l1", servers[82], servers[160] );
		network.addLink( "l303", servers[126], servers[96] );
		network.addLink( "l418", servers[93], servers[47] );
		network.addLink( "l687", servers[90], servers[50] );
		network.addLink( "l383", servers[114], servers[102] );
		network.addLink( "l524", servers[105], servers[47] );
		network.addLink( "l620", servers[87], servers[136] );
		network.addLink( "l333", servers[18], servers[70] );
		network.addLink( "l109", servers[70], servers[99] );
		network.addLink( "l652", servers[64], servers[54] );
		network.addLink( "l101", servers[100], servers[67] );
		network.addLink( "l155", servers[158], servers[144] );
		network.addLink( "l655", servers[92], servers[42] );
		network.addLink( "l80", servers[10], servers[116] );
		network.addLink( "l682", servers[150], servers[62] );
		network.addLink( "l85", servers[10], servers[122] );
		network.addLink( "l378", servers[114], servers[97] );
		network.addLink( "l6", servers[157], servers[118] );
		network.addLink( "l460", servers[57], servers[134] );
		network.addLink( "l684", servers[150], servers[64] );
		network.addLink( "l50", servers[102], servers[20] );
		network.addLink( "l564", servers[84], servers[18] );
		network.addLink( "l745", servers[107], servers[24] );
		network.addLink( "l496", servers[156], servers[145] );
		network.addLink( "l31", servers[62], servers[118] );
		network.addLink( "l33", servers[62], servers[120] );
		network.addLink( "l16", servers[0], servers[18] );
		network.addLink( "l504", servers[108], servers[123] );
		network.addLink( "l674", servers[55], servers[119] );
		network.addLink( "l283", servers[85], servers[120] );
		network.addLink( "l666", servers[81], servers[19] );
		network.addLink( "l170", servers[73], servers[42] );
		network.addLink( "l420", servers[75], servers[134] );
		network.addLink( "l410", servers[89], servers[49] );
		network.addLink( "l495", servers[156], servers[144] );
		network.addLink( "l159", servers[59], servers[69] );
		network.addLink( "l428", servers[75], servers[142] );
		network.addLink( "l12", servers[157], servers[124] );
		network.addLink( "l11", servers[157], servers[123] );
		network.addLink( "l136", servers[88], servers[136] );
		network.addLink( "l437", servers[80], servers[95] );
		network.addLink( "l486", servers[156], servers[134] );
		network.addLink( "l112", servers[70], servers[103] );
		network.addLink( "l438", servers[80], servers[96] );
		network.addLink( "l262", servers[98], servers[49] );
		network.addLink( "l244", servers[26], servers[124] );
		network.addLink( "l632", servers[33], servers[28] );
		network.addLink( "l143", servers[88], servers[144] );
		network.addLink( "l259", servers[98], servers[46] );
		network.addLink( "l465", servers[57], servers[139] );
		network.addLink( "l537", servers[15], servers[45] );
		network.addLink( "l578", servers[8], servers[141] );
		network.addLink( "l719", servers[155], servers[143] );
		network.addLink( "l56", servers[110], servers[61] );
		network.addLink( "l474", servers[132], servers[20] );
		network.addLink( "l563", servers[84], servers[17] );
		network.addLink( "l166", servers[68], servers[64] );
		network.addLink( "l380", servers[114], servers[99] );
		network.addLink( "l295", servers[7], servers[47] );
		network.addLink( "l569", servers[84], servers[24] );
		network.addLink( "l23", servers[121], servers[59] );
		network.addLink( "l470", servers[57], servers[145] );
		network.addLink( "l134", servers[88], servers[134] );
		network.addLink( "l553", servers[148], servers[138] );
		network.addLink( "l74", servers[115], servers[141] );
		network.addLink( "l41", servers[24], servers[98] );
		network.addLink( "l604", servers[128], servers[121] );
		network.addLink( "l316", servers[9], servers[54] );
		network.addLink( "l288", servers[85], servers[125] );
		network.addLink( "l40", servers[24], servers[97] );
		network.addLink( "l613", servers[14], servers[105] );
		network.addLink( "l26", servers[121], servers[63] );
		network.addLink( "l28", servers[121], servers[65] );
		network.addLink( "l712", servers[155], servers[135] );
		network.addLink( "l194", servers[40], servers[143] );
		network.addLink( "l302", servers[126], servers[95] );
		network.addLink( "l704", servers[4], servers[44] );
		network.addLink( "l216", servers[37], servers[16] );
		network.addLink( "l390", servers[94], servers[79] );
		network.addLink( "l489", servers[156], servers[137] );
		network.addLink( "l596", servers[129], servers[107] );
		network.addLink( "l248", servers[76], servers[30] );
		network.addLink( "l297", servers[7], servers[49] );
		network.addLink( "l57", servers[110], servers[62] );
		network.addLink( "l67", servers[115], servers[134] );
		network.addLink( "l725", servers[111], servers[107] );
		network.addLink( "l417", servers[93], servers[46] );
		network.addLink( "l69", servers[115], servers[136] );
		network.addLink( "l589", servers[147], servers[75] );
		network.addLink( "l659", servers[92], servers[46] );
		network.addLink( "l127", servers[36], servers[120] );
		network.addLink( "l384", servers[103], servers[113] );
		network.addLink( "l104", servers[100], servers[71] );
		network.addLink( "l223", servers[37], servers[24] );
		network.addLink( "l683", servers[150], servers[63] );
		network.addLink( "l46", servers[102], servers[16] );
		network.addLink( "l226", servers[162], servers[29] );
		network.addLink( "l305", servers[126], servers[98] );
		network.addLink( "l15", servers[0], servers[17] );
		network.addLink( "l266", servers[41], servers[99] );
		network.addLink( "l412", servers[93], servers[41] );
		network.addLink( "l561", servers[21], servers[86] );
		network.addLink( "l164", servers[68], servers[62] );
		network.addLink( "l533", servers[15], servers[40] );
		network.addLink( "l319", servers[2], servers[84] );
		network.addLink( "l442", servers[80], servers[101] );
		network.addLink( "l160", servers[59], servers[70] );
		network.addLink( "l239", servers[26], servers[119] );
		network.addLink( "l693", servers[3], servers[96] );
		network.addLink( "l123", servers[36], servers[116] );
		network.addLink( "l424", servers[75], servers[138] );
		network.addLink( "l593", servers[104], servers[130] );
		network.addLink( "l631", servers[33], servers[27] );
		network.addLink( "l713", servers[155], servers[137] );
		network.addLink( "l198", servers[134], servers[42] );
		network.addLink( "l24", servers[121], servers[60] );
		network.addLink( "l656", servers[92], servers[43] );
		network.addLink( "l469", servers[57], servers[144] );
		network.addLink( "l204", servers[134], servers[48] );
		network.addLink( "l284", servers[85], servers[121] );
		network.addLink( "l463", servers[57], servers[137] );
		network.addLink( "l339", servers[69], servers[21] );
		network.addLink( "l697", servers[3], servers[101] );
		network.addLink( "l48", servers[102], servers[18] );
		network.addLink( "l452", servers[31], servers[98] );
		network.addLink( "l357", servers[35], servers[140] );
		network.addLink( "l107", servers[70], servers[97] );
		network.addLink( "l439", servers[80], servers[98] );
		network.addLink( "l187", servers[40], servers[136] );
		network.addLink( "l193", servers[40], servers[142] );
		network.addLink( "l168", servers[73], servers[40] );
		network.addLink( "l177", servers[56], servers[95] );
		network.addLink( "l359", servers[35], servers[142] );
		network.addLink( "l699", servers[3], servers[103] );
		network.addLink( "l362", servers[35], servers[145] );
		network.addLink( "l737", servers[20], servers[110] );
		network.addLink( "l116", servers[83], servers[67] );
		network.addLink( "l426", servers[75], servers[140] );
		network.addLink( "l182", servers[56], servers[101] );
		network.addLink( "l209", servers[39], servers[61] );
		network.addLink( "l334", servers[18], servers[71] );
		network.addLink( "l472", servers[132], servers[17] );
		network.addLink( "l536", servers[15], servers[43] );
		network.addLink( "l184", servers[56], servers[103] );
		network.addLink( "l95", servers[28], servers[20] );
		network.addLink( "l532", servers[42], servers[110] );
		network.addLink( "l280", servers[85], servers[116] );
		network.addLink( "l534", servers[15], servers[41] );
		network.addLink( "l393", servers[11], servers[76] );
		network.addLink( "l562", servers[84], servers[16] );
		network.addLink( "l293", servers[7], servers[44] );
		network.addLink( "l398", servers[12], servers[76] );
		network.addLink( "l645", servers[53], servers[61] );
		network.addLink( "l330", servers[18], servers[66] );
		network.addLink( "l473", servers[132], servers[18] );
		network.addLink( "l386", servers[94], servers[75] );
		network.addLink( "l445", servers[25], servers[35] );
		network.addLink( "l287", servers[85], servers[124] );
		network.addLink( "l647", servers[53], servers[63] );
		network.addLink( "l309", servers[126], servers[103] );
		network.addLink( "l188", servers[40], servers[137] );
		network.addLink( "l282", servers[85], servers[118] );
		network.addLink( "l527", servers[42], servers[104] );
		network.addLink( "l60", servers[65], servers[104] );
		network.addLink( "l322", servers[50], servers[68] );
		network.addLink( "l615", servers[14], servers[108] );
		network.addLink( "l34", servers[62], servers[122] );
		network.addLink( "l268", servers[41], servers[101] );
	}

	public static void createLinks2() throws Exception {
		network.addLink( "l416", servers[93], servers[45] );
		network.addLink( "l181", servers[56], servers[100] );
		network.addLink( "l73", servers[115], servers[140] );
		network.addLink( "l618", servers[87], servers[133] );
		network.addLink( "l722", servers[111], servers[104] );
		network.addLink( "l110", servers[70], servers[101] );
		network.addLink( "l614", servers[14], servers[107] );
		network.addLink( "l714", servers[155], servers[138] );
		network.addLink( "l72", servers[115], servers[139] );
		network.addLink( "l379", servers[114], servers[98] );
		network.addLink( "l247", servers[76], servers[29] );
		network.addLink( "l518", servers[105], servers[40] );
		network.addLink( "l261", servers[98], servers[48] );
		network.addLink( "l105", servers[70], servers[95] );
		network.addLink( "l290", servers[7], servers[41] );
		network.addLink( "l640", servers[151], servers[123] );
		network.addLink( "l346", servers[38], servers[162] );
		network.addLink( "l646", servers[53], servers[62] );
		network.addLink( "l600", servers[128], servers[117] );
		network.addLink( "l491", servers[156], servers[139] );
		network.addLink( "l739", servers[107], servers[17] );
		network.addLink( "l742", servers[107], servers[21] );
		network.addLink( "l546", servers[154], servers[161] );
		network.addLink( "l718", servers[155], servers[142] );
		network.addLink( "l51", servers[102], servers[21] );
		network.addLink( "l52", servers[102], servers[22] );
		network.addLink( "l301", servers[101], servers[127] );
		network.addLink( "l157", servers[59], servers[66] );
		network.addLink( "l162", servers[68], servers[60] );
		network.addLink( "l243", servers[26], servers[123] );
		network.addLink( "l734", servers[20], servers[106] );
		network.addLink( "l397", servers[12], servers[75] );
		network.addLink( "l431", servers[75], servers[145] );
		network.addLink( "l404", servers[89], servers[42] );
		network.addLink( "l432", servers[133], servers[74] );
		network.addLink( "l440", servers[80], servers[99] );
		network.addLink( "l154", servers[158], servers[143] );
		network.addLink( "l374", servers[5], servers[145] );
		network.addLink( "l142", servers[88], servers[143] );
		network.addLink( "l289", servers[7], servers[40] );
		network.addLink( "l568", servers[84], servers[23] );
		network.addLink( "l663", servers[81], servers[16] );
		network.addLink( "l77", servers[115], servers[144] );
		network.addLink( "l65", servers[65], servers[109] );
		network.addLink( "l233", servers[146], servers[69] );
		network.addLink( "l447", servers[25], servers[37] );
		network.addLink( "l565", servers[84], servers[19] );
		network.addLink( "l715", servers[155], servers[139] );
		network.addLink( "l84", servers[10], servers[121] );
		network.addLink( "l246", servers[76], servers[28] );
		network.addLink( "l351", servers[35], servers[133] );
		network.addLink( "l53", servers[102], servers[23] );
		network.addLink( "l501", servers[108], servers[120] );
		network.addLink( "l314", servers[9], servers[51] );
		network.addLink( "l217", servers[37], servers[17] );
		network.addLink( "l306", servers[126], servers[99] );
		network.addLink( "l542", servers[163], servers[152] );
		network.addLink( "l114", servers[112], servers[2] );
		network.addLink( "l251", servers[27], servers[77] );
		network.addLink( "l394", servers[11], servers[78] );
		network.addLink( "l547", servers[154], servers[162] );
		network.addLink( "l461", servers[57], servers[135] );
		network.addLink( "l421", servers[75], servers[135] );
		network.addLink( "l454", servers[31], servers[100] );
		network.addLink( "l588", servers[147], servers[74] );
		network.addLink( "l402", servers[89], servers[40] );
		network.addLink( "l149", servers[158], servers[137] );
		network.addLink( "l679", servers[55], servers[125] );
		network.addLink( "l237", servers[26], servers[116] );
		network.addLink( "l443", servers[80], servers[102] );
		network.addLink( "l389", servers[94], servers[78] );
		network.addLink( "l539", servers[15], servers[47] );
		network.addLink( "l335", servers[69], servers[16] );
		network.addLink( "l733", servers[20], servers[105] );
		network.addLink( "l332", servers[18], servers[68] );
		network.addLink( "l381", servers[114], servers[100] );
		network.addLink( "l130", servers[36], servers[124] );
		network.addLink( "l345", servers[38], servers[161] );
		network.addLink( "l506", servers[124], servers[104] );
		network.addLink( "l509", servers[124], servers[107] );
		network.addLink( "l129", servers[36], servers[122] );
		network.addLink( "l579", servers[8], servers[142] );
		network.addLink( "l156", servers[158], servers[145] );
		network.addLink( "l358", servers[35], servers[141] );
		network.addLink( "l430", servers[75], servers[144] );
		network.addLink( "l694", servers[3], servers[97] );
		network.addLink( "l340", servers[69], servers[22] );
		network.addLink( "l281", servers[85], servers[117] );
		network.addLink( "l455", servers[31], servers[101] );
		network.addLink( "l698", servers[3], servers[102] );
		network.addLink( "l427", servers[75], servers[141] );
		network.addLink( "l744", servers[107], servers[23] );
		network.addLink( "l254", servers[98], servers[40] );
		network.addLink( "l265", servers[41], servers[97] );
		network.addLink( "l505", servers[108], servers[125] );
		network.addLink( "l554", servers[148], servers[139] );
		network.addLink( "l338", servers[69], servers[20] );
		network.addLink( "l729", servers[13], servers[7] );
		network.addLink( "l521", servers[105], servers[44] );
		network.addLink( "l388", servers[94], servers[77] );
		network.addLink( "l612", servers[14], servers[104] );
		network.addLink( "l538", servers[15], servers[46] );
		network.addLink( "l106", servers[70], servers[96] );
		network.addLink( "l238", servers[26], servers[117] );
		network.addLink( "l507", servers[124], servers[105] );
		network.addLink( "l462", servers[57], servers[136] );
		network.addLink( "l133", servers[88], servers[133] );
		network.addLink( "l211", servers[39], servers[64] );
		network.addLink( "l643", servers[53], servers[59] );
		network.addLink( "l642", servers[151], servers[125] );
		network.addLink( "l258", servers[98], servers[45] );
		network.addLink( "l709", servers[4], servers[49] );
		network.addLink( "l9", servers[157], servers[121] );
		network.addLink( "l585", servers[58], servers[129] );
		network.addLink( "l678", servers[55], servers[124] );
		network.addLink( "l98", servers[28], servers[23] );
		network.addLink( "l695", servers[3], servers[98] );
		network.addLink( "l138", servers[88], servers[138] );
		network.addLink( "l392", servers[11], servers[75] );
		network.addLink( "l203", servers[134], servers[47] );
		network.addLink( "l422", servers[75], servers[136] );
		network.addLink( "l575", servers[8], servers[138] );
		network.addLink( "l551", servers[148], servers[136] );
		network.addLink( "l197", servers[134], servers[41] );
		network.addLink( "l419", servers[93], servers[48] );
		network.addLink( "l355", servers[35], servers[138] );
		network.addLink( "l468", servers[57], servers[143] );
		network.addLink( "l425", servers[75], servers[139] );
		network.addLink( "l366", servers[5], servers[136] );
		network.addLink( "l97", servers[28], servers[22] );
		network.addLink( "l644", servers[53], servers[60] );
		network.addLink( "l731", servers[13], servers[9] );
		network.addLink( "l531", servers[42], servers[109] );
		network.addLink( "l86", servers[10], servers[123] );
		network.addLink( "l403", servers[89], servers[41] );
		network.addLink( "l391", servers[11], servers[74] );
		network.addLink( "l625", servers[87], servers[141] );
		network.addLink( "l242", servers[26], servers[122] );
		network.addLink( "l444", servers[80], servers[103] );
		network.addLink( "l173", servers[73], servers[45] );
		network.addLink( "l738", servers[107], servers[16] );
		network.addLink( "l667", servers[81], servers[20] );
		network.addLink( "l126", servers[36], servers[119] );
		network.addLink( "l446", servers[25], servers[36] );
		network.addLink( "l347", servers[38], servers[163] );
		network.addLink( "l692", servers[3], servers[95] );
		network.addLink( "l601", servers[128], servers[118] );
		network.addLink( "l703", servers[4], servers[42] );
		network.addLink( "l457", servers[31], servers[103] );
		network.addLink( "l165", servers[68], servers[63] );
		network.addLink( "l327", servers[66], servers[52] );
		network.addLink( "l497", servers[108], servers[116] );
		network.addLink( "l635", servers[151], servers[117] );
		network.addLink( "l62", servers[65], servers[106] );
		network.addLink( "l228", servers[30], servers[160] );
		network.addLink( "l475", servers[132], servers[21] );
		network.addLink( "l567", servers[84], servers[22] );
		network.addLink( "l7", servers[157], servers[119] );
		network.addLink( "l616", servers[14], servers[109] );
		network.addLink( "l64", servers[65], servers[108] );
		network.addLink( "l323", servers[50], servers[69] );
		network.addLink( "l544", servers[154], servers[159] );
		network.addLink( "l88", servers[10], servers[125] );
		network.addLink( "l230", servers[30], servers[163] );
		network.addLink( "l240", servers[26], servers[120] );
		network.addLink( "l673", servers[55], servers[118] );
		network.addLink( "l624", servers[87], servers[140] );
		network.addLink( "l131", servers[36], servers[125] );
		network.addLink( "l686", servers[61], servers[149] );
		network.addLink( "l528", servers[42], servers[106] );
		network.addLink( "l307", servers[126], servers[100] );
		network.addLink( "l415", servers[93], servers[44] );
		network.addLink( "l285", servers[85], servers[122] );
		network.addLink( "l202", servers[134], servers[46] );
		network.addLink( "l671", servers[55], servers[116] );
		network.addLink( "l213", servers[23], servers[34] );
		network.addLink( "l516", servers[153], servers[52] );
		network.addLink( "l696", servers[3], servers[100] );
		network.addLink( "l371", servers[5], servers[142] );
		network.addLink( "l128", servers[36], servers[121] );
		network.addLink( "l363", servers[5], servers[133] );
		network.addLink( "l629", servers[87], servers[145] );
		network.addLink( "l407", servers[89], servers[45] );
		network.addLink( "l115", servers[83], servers[66] );
		network.addLink( "l199", servers[134], servers[43] );
		network.addLink( "l299", servers[45], servers[8] );
		network.addLink( "l361", servers[35], servers[144] );
		network.addLink( "l229", servers[30], servers[161] );
		network.addLink( "l286", servers[85], servers[123] );
		network.addLink( "l367", servers[5], servers[137] );
		network.addLink( "l270", servers[41], servers[103] );
		network.addLink( "l540", servers[15], servers[48] );
		network.addLink( "l163", servers[68], servers[61] );
		network.addLink( "l30", servers[62], servers[117] );
		network.addLink( "l499", servers[108], servers[118] );
		network.addLink( "l3", servers[82], servers[163] );
		network.addLink( "l541", servers[15], servers[49] );
		network.addLink( "l676", servers[55], servers[122] );
	}

	public static void createFlows1() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f110", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[130] );
		network.addFlow( "f177", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f276", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f522", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f378", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f614", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f646", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f121", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f463", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f75", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f625", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f129", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f271", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f559", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f626", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f48", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f413", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f243", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f544", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[74] );
		network.addFlow( "f580", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f259", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		network.addFlow( "f84", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f607", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f486", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f488", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f547", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[13] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f389", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f221", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f474", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f515", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f123", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		servers_on_path_s.add( servers[6] );
		network.addFlow( "f314", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f13", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f191", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f450", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f82", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f115", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f525", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f11", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f400", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f517", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f622", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		network.addFlow( "f482", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f200", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f530", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f520", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f356", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f302", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f641", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f339", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f27", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f171", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f329", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f69", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f228", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f140", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f215", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		network.addFlow( "f526", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f317", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f313", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[49] );
		network.addFlow( "f205", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f632", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		network.addFlow( "f24", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f578", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f545", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f66", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f477", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[7] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f461", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f432", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f148", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f610", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f146", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f168", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f599", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f374", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f225", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f353", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		network.addFlow( "f647", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f153", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f164", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f469", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows2() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f509", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f418", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f340", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f79", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f307", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f550", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[130] );
		network.addFlow( "f367", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[130] );
		network.addFlow( "f513", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f241", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f229", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f569", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f391", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f512", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f633", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f203", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		network.addFlow( "f616", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f332", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f233", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f234", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		network.addFlow( "f256", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f309", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f373", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f523", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f31", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f260", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f415", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[144] );
		network.addFlow( "f211", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f451", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f581", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f613", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f185", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f231", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		network.addFlow( "f421", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f511", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f88", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f541", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f266", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f381", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f496", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f107", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f119", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f606", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f286", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f454", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f417", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f642", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[155] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f57", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f113", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f412", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f507", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f44", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		network.addFlow( "f439", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f572", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f510", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f349", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f595", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f1", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f551", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f210", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f223", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f236", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f134", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[146] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f397", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f494", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f457", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f567", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[79] );
		network.addFlow( "f83", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f196", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f249", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[22] );
		network.addFlow( "f420", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f643", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f244", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f218", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		network.addFlow( "f331", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f470", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f321", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		network.addFlow( "f556", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f147", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f490", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f213", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows3() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f170", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f623", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		network.addFlow( "f344", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f518", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f447", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f479", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f15", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f274", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f371", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[146] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f112", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f193", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f557", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f10", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f51", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f370", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f145", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f111", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[130] );
		network.addFlow( "f173", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f284", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f459", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f167", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f180", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f383", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f78", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f16", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f133", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f81", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f169", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f278", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[95] );
		network.addFlow( "f506", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f65", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f91", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f104", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f224", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f240", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f90", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f543", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f621", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f443", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f60", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f365", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f252", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f363", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f359", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f540", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f42", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f89", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f247", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f598", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f650", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f54", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f441", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f382", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f410", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f126", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f416", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f118", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f568", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f99", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f257", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f116", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f579", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f154", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f498", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f199", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f122", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[155] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f586", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f29", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f93", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f505", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f297", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f124", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f293", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f405", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows4() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f198", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f77", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f137", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f285", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f14", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f270", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f323", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f608", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f528", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f76", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f96", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f458", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f63", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f379", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f268", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[156] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f393", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f131", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f448", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f37", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[79] );
		network.addFlow( "f17", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[69] );
		network.addFlow( "f161", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f437", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f366", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f563", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f573", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f19", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f186", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f527", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f385", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[155] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f395", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f640", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f50", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f291", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f456", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f591", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f22", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f351", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f219", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f449", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f536", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f85", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f28", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f434", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f25", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f267", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f326", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[79] );
		network.addFlow( "f427", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f192", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f502", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f141", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f316", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f92", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		network.addFlow( "f195", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f95", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f155", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f156", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f312", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f35", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f30", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f72", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f97", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f491", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f408", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		network.addFlow( "f358", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f615", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		network.addFlow( "f296", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f407", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f492", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f32", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f406", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f194", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f67", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f261", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f217", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f181", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f549", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[29] );
		network.addFlow( "f648", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f250", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows5() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f333", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f235", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f290", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		network.addFlow( "f481", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f612", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[91] );
		servers_on_path_s.add( servers[150] );
		network.addFlow( "f376", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f73", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f166", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f190", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[123] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f571", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f483", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f49", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f500", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f593", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f8", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f655", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f237", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f86", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f157", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[17] );
		network.addFlow( "f120", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f175", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f304", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f369", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f283", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f446", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f222", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f238", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f138", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[146] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f311", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f5", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f151", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f209", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[104] );
		servers_on_path_s.add( servers[130] );
		network.addFlow( "f475", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f386", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f499", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[57] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f619", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f160", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f36", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f453", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f143", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f80", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f554", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f628", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f55", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f52", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[163] );
		network.addFlow( "f503", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f71", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f368", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f553", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f227", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f18", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[146] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f264", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f430", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f375", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[79] );
		network.addFlow( "f362", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f644", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f12", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[155] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f471", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f179", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f426", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f431", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f163", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f539", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f300", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f589", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f565", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f639", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f105", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f106", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f603", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f604", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f7", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f651", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f58", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		network.addFlow( "f100", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[34] );
		network.addFlow( "f401", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f345", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f638", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows6() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f103", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[163] );
		network.addFlow( "f292", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f584", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f600", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f149", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f468", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f20", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f33", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f514", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f575", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f562", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f43", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f636", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f564", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f342", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f594", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f485", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f538", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f162", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f585", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f645", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f445", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f204", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f265", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f629", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f98", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f68", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f132", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f583", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f294", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f394", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f288", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f433", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f561", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f560", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f414", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f207", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f4", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f305", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f347", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f558", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f109", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f117", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f275", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f108", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f534", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f384", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f460", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f248", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f263", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f220", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f158", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f519", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f577", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f354", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f360", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f102", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f617", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f212", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f532", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f128", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f325", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f597", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f495", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f56", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f87", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f605", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f232", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f588", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f269", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[123] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f548", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f322", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f480", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f467", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f46", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[78] );
		network.addFlow( "f436", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f478", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f504", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows7() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f239", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[92] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f287", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f184", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[88] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f403", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f601", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[68] );
		network.addFlow( "f41", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f61", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f422", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f440", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f497", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f251", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f627", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f355", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f472", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f348", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f444", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f465", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f521", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f21", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f462", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f183", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[104] );
		network.addFlow( "f299", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f23", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f566", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[2] );
		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f341", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f45", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f634", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		network.addFlow( "f125", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f620", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f652", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f3", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[39] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f624", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f346", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f6", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[103] );
		servers_on_path_s.add( servers[113] );
		network.addFlow( "f206", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f279", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f631", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f253", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f364", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f429", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f487", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f654", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f428", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f262", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f396", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f576", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[23] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f39", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		network.addFlow( "f201", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f404", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f289", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f570", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f409", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[27] );
		network.addFlow( "f226", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		servers_on_path_s.add( servers[159] );
		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f174", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f152", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[157] );
		servers_on_path_s.add( servers[123] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f399", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f501", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f438", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f455", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f508", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f172", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f230", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f208", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f531", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f352", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f618", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f176", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f298", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f582", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f337", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[150] );
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f350", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[31] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f537", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f392", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		network.addFlow( "f9", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f546", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f630", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows8() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[84] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f127", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f596", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[4] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f327", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f334", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f182", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f380", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[32] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f62", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f411", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[16] );
		servers_on_path_s.add( servers[1] );
		network.addFlow( "f464", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f452", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f328", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[155] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f435", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f142", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[36] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f574", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f64", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f26", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f372", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[10] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f59", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f139", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f306", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f2", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f280", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[50] );
		servers_on_path_s.add( servers[69] );
		network.addFlow( "f336", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f315", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[131] );
		servers_on_path_s.add( servers[154] );
		servers_on_path_s.add( servers[160] );
		network.addFlow( "f242", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f308", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f74", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[83] );
		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[17] );
		servers_on_path_s.add( servers[27] );
		servers_on_path_s.add( servers[78] );
		network.addFlow( "f282", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		network.addFlow( "f246", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f136", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f187", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f484", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f357", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f178", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f609", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[87] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f524", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[64] );
		servers_on_path_s.add( servers[54] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f343", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[55] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f552", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f150", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[133] );
		servers_on_path_s.add( servers[79] );
		network.addFlow( "f529", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[41] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f318", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[5] );
		servers_on_path_s.add( servers[145] );
		servers_on_path_s.add( servers[113] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f398", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f423", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f590", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[147] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f38", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f635", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f197", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[14] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f255", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[90] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f493", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[112] );
		servers_on_path_s.add( servers[0] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[95] );
		network.addFlow( "f611", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f189", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[3] );
		servers_on_path_s.add( servers[100] );
		servers_on_path_s.add( servers[68] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f361", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[116] );
		network.addFlow( "f377", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f555", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[15] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f587", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[101] );
		servers_on_path_s.add( servers[127] );
		network.addFlow( "f335", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f542", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[24] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f188", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		network.addFlow( "f202", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[53] );
		servers_on_path_s.add( servers[62] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f272", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[45] );
		network.addFlow( "f0", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[12] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f533", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f387", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f425", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f473", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[56] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f40", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[18] );
		servers_on_path_s.add( servers[66] );
		servers_on_path_s.add( servers[51] );
		network.addFlow( "f419", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[158] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[9] );
		servers_on_path_s.add( servers[50] );
		network.addFlow( "f159", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[85] );
		servers_on_path_s.add( servers[124] );
		network.addFlow( "f476", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[80] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f216", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f165", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[59] );
		servers_on_path_s.add( servers[70] );
		servers_on_path_s.add( servers[97] );
		network.addFlow( "f245", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[58] );
		servers_on_path_s.add( servers[129] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f34", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		servers_on_path_s.add( servers[37] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f258", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[114] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f130", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[94] );
		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f135", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public static void createFlows9() throws Exception {
		LinkedList<Server> servers_on_path_s = new LinkedList<Server>();
		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f319", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[69] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f535", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f70", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[26] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f53", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[30] );
		servers_on_path_s.add( servers[163] );
		servers_on_path_s.add( servers[152] );
		network.addFlow( "f310", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[65] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f388", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[11] );
		servers_on_path_s.add( servers[76] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f402", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f277", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[148] );
		servers_on_path_s.add( servers[134] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f466", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[81] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f114", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[153] );
		servers_on_path_s.add( servers[52] );
		servers_on_path_s.add( servers[8] );
		servers_on_path_s.add( servers[137] );
		servers_on_path_s.add( servers[34] );
		network.addFlow( "f330", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f489", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[106] );
		network.addFlow( "f254", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[73] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f214", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f390", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[111] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f47", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[102] );
		servers_on_path_s.add( servers[23] );
		network.addFlow( "f94", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[93] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f320", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[89] );
		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f602", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[42] );
		servers_on_path_s.add( servers[110] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f324", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f637", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[72] );
		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[45] );
		network.addFlow( "f303", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[75] );
		servers_on_path_s.add( servers[144] );
		servers_on_path_s.add( servers[7] );
		network.addFlow( "f281", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[82] );
		servers_on_path_s.add( servers[162] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f516", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[151] );
		servers_on_path_s.add( servers[121] );
		servers_on_path_s.add( servers[61] );
		network.addFlow( "f301", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[38] );
		network.addFlow( "f101", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[33] );
		servers_on_path_s.add( servers[28] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f442", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f649", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[107] );
		servers_on_path_s.add( servers[22] );
		network.addFlow( "f592", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[126] );
		servers_on_path_s.add( servers[98] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f424", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[25] );
		network.addFlow( "f144", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[35] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f295", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[128] );
		servers_on_path_s.add( servers[124] );
		servers_on_path_s.add( servers[105] );
		servers_on_path_s.add( servers[40] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f338", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[115] );
		servers_on_path_s.add( servers[143] );
		network.addFlow( "f653", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

		servers_on_path_s.add( servers[132] );
		servers_on_path_s.add( servers[20] );
		servers_on_path_s.add( servers[108] );
		servers_on_path_s.add( servers[117] );
		network.addFlow( "f273", factory.createArrivalCurve( "AC{(0.0,0.0),0.0;!(0.0,5.0),5.0}" ), servers_on_path_s );
		servers_on_path_s.clear();

	}

	public GLP60_ServerGraph() {
		try{
			servers = new Server[164];
			network = new Network();
			createServers1();
			createLinks1();
			createLinks2();
			createFlows1();
			createFlows2();
			createFlows3();
			createFlows4();
			createFlows5();
			createFlows6();
			createFlows7();
			createFlows8();
			createFlows9();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

