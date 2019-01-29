# NetworkCalculus.org DNC

Deterministic Network Calculus is a methodology for worst-case modeling and analysis of communication networks. It enables to derive deterministic bounds on a server’s backlog as well as a flow’s end-to-end delay. Given a directed graph of servers (server graph) and the flows crossing these servers, the Deterministic Network Calculator (DNC) automates the derivation of bounds.

## Usage

These experiments depend on the code restructuring of the DNC v2.5.0.

## Experiments

The package org.networkcalculus.dnc.experiments contains executable classes to start the experiments of a certain publication. These classes are named after the publication venue and the publication year. An equally named BibTeX entry can also be found in this package.
Results of the experiments are stored to the respective *results subpackages.  

The other subpackages of org.networkcalculus.dnc.experiments contain the different network representations that were used in the respective numerical evaluations. These packages are named after the publication class and either have a "devicegraphs" or "servergraphs" suffix (server graphs + flows).
If you use any of the provided server graphs, please use provide the given reference (BibTex entry in org.networkcalculus.dnc.experiments) in any resulting publication.

The server graphs may have been created by an external topology creator. In this case, we add as much additional information as possible in order to recreate the server graphs, for instance the original output of that external tool. In that case, we apply the conversion from topology to server graph as depicted in the following publication:  

```plain
@inproceedings{DiscoDNCv2:Modeling:IterativeDesign,
  author    = {Bruno Cattelan and Steffen Bondorf},
  title     = {Iterative Design Space Exploration for Networks Requiring Performance Guarantees},
  booktitle = {Proc. of the IEEE/AIAA 36th Digital Avionics Systems Conference},
  series    = {DASC '17},
  month     = {September},
  year      = 2017,
  url       = {https://ieeexplore.ieee.org/document/8102106/}
}
```
