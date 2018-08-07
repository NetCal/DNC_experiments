# DiscoDNC

Deterministic Network Calculus (DNC) is a methodology for worst-case modeling and analysis of communication networks. It enables to derive deterministic bounds on a server’s backlog as well as a flow’s end-to-end delay. Given a directed graph of servers (server graph) and the flows crossing these servers, the Disco Deterministic Network Calculator (DiscoDNC) automates the derivation of bounds.

## Usage

These experiments depend on the code restructuring of the DiscoDNC's v2.5 branch (version as of 2018-Aug-06).
Please see https://github.com/NetCal/DiscoDNC/blob/v2.5/README.md for more information.

## Experiments

The package de.uni_kl.cs.discodnc.experiments contains executable classes to start the experiments of a certain publication. These classes are named after the publication venue and the publication year. An equally named BibTeX entry can also be found in this package.
Results of the experiments are stored to the respective *results subpackages.  

The othter subpackages of de.uni_kl.cs.discodnc.experiments contain the actual networks (server graphs + flows) that were used in the numerical evaluations. These packages are named after the executable class and have a "networks" suffix.
If you use any of the provided server graphs, please use provide the given reference (BibTex entry in de.uni_kl.cs.discodnc.experiments) in any resulting publication.

The server graphs may have been created by an external topology creator. In this case, we add as much additional information as possible in order to recreate the server graphs, for instance the original output of that external tool. In that case, we apply the conversion from topology to server graph as depicted in the following publication:  
    *Iterative Design Space Exploration for Networks Requiring Performance Guarantees  
    (Bruno Cattelan, Steffen Bondorf),  
    In Proc. of the IEEE/AIAA 36th Digital Avionics Systems Conference (DASC), 2017.*
