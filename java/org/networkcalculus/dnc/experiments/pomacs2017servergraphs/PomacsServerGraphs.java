package org.networkcalculus.dnc.experiments.pomacs2017servergraphs;

import org.networkcalculus.dnc.network.server_graph.ServerGraph;

public class PomacsServerGraphs {
	public static ServerGraph getServerGraph( int num_net_devices ) {
		switch (num_net_devices) {
		case 20:
			return (new GLP20_ServerGraph()).server_graph;
		case 40:
			return (new GLP40_ServerGraph()).server_graph;
		case 60:
			return (new GLP60_ServerGraph()).server_graph;
		case 80:
			return (new GLP80_ServerGraph()).server_graph;
		case 100:
			return (new GLP100_ServerGraph()).server_graph;
		case 120:
			return (new GLP120_ServerGraph()).server_graph;
		case 140:
			return (new GLP140_ServerGraph()).server_graph;
		case 160:
			return (new GLP160_ServerGraph()).server_graph;
		case 180:
			return (new GLP180_ServerGraph()).server_graph;
		case 200:
			return (new GLP200_ServerGraph()).server_graph;
		case 220:
			return (new GLP220_ServerGraph()).server_graph;
		case 240:
			return (new GLP240_ServerGraph()).server_graph;
		case 260:
			return (new GLP260_ServerGraph()).server_graph;
		case 280:
			return (new GLP280_ServerGraph()).server_graph;
		case 300:
			return (new GLP300_ServerGraph()).server_graph;
		case 400:
			return (new GLP400_ServerGraph()).server_graph;
		case 500:
			return (new GLP500_ServerGraph()).server_graph;
		case 1000:
			return (new GLP1000_ServerGraph()).server_graph;

		default:
			throw new RuntimeException("Invalid number of network devices: " + Integer.toString(num_net_devices));
		}
	}
}
