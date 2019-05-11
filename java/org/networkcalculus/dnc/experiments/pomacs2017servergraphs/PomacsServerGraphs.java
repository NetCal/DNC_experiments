package org.networkcalculus.dnc.experiments.pomacs2017servergraphs;

import org.networkcalculus.dnc.network.server_graph.ServerGraph;

public final class PomacsServerGraphs {
	public static ServerGraph getServerGraph( int num_net_devices ) {
		switch (num_net_devices) {
		case 20:
			return GLP20_ServerGraph.server_graph;
		case 40:
			return GLP40_ServerGraph.server_graph;
		case 60:
			return GLP60_ServerGraph.server_graph;
		case 80:
			return GLP80_ServerGraph.server_graph;
		case 100:
			return GLP100_ServerGraph.server_graph;
		case 120:
			return GLP120_ServerGraph.server_graph;
		case 140:
			return GLP140_ServerGraph.server_graph;
		case 160:
			return GLP160_ServerGraph.server_graph;
		case 180:
			return GLP180_ServerGraph.server_graph;
		case 200:
			return GLP200_ServerGraph.server_graph;
		case 220:
			return GLP220_ServerGraph.server_graph;
		case 240:
			return GLP240_ServerGraph.server_graph;
		case 260:
			return GLP260_ServerGraph.server_graph;
		case 280:
			return GLP280_ServerGraph.server_graph;
		case 300:
			return GLP300_ServerGraph.server_graph;
		case 400:
			return GLP400_ServerGraph.server_graph;
		case 500:
			return GLP500_ServerGraph.server_graph;
		case 1000:
			return GLP1000_ServerGraph.server_graph;

		default:
			throw new RuntimeException("Invalid number of network devices: " + Integer.toString(num_net_devices));
		}
	}
}
