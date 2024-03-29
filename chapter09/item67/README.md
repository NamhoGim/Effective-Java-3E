# Item 67: Optimize judiciously

* Strive to write good programs rather than fast ones.

* Strive to avoid design decisions that limit performance.

* Consider the performance consequences of your API design decisions.

* It is a very bad idea to warp an API to achieve good performance.

* Measure performance before and after each attempted optimization.

Do not strive to write fast programs -- strive to write good ones; speed will follow. But do think aobut performance 
while you're designing systems, especially while you're designing APIs, wire-level protocols, and persistent data 
formats. When you've finished building the system, measure its performance. If it's fast enough, you're done. If not,
locate the source of the problem with the aid of a profiler and go to work optimizing the relevant part of the system.
The first step is to examine your choice of algorithms; no amount of low-level optimization can make up for a poor 
choice of algorithm. Repeat this process as necessary, measuring the performance after every change, until you're 
satisfied.
