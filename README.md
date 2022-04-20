# IS-211 Mandatory Assignment 3

Chosen task: A. Network Management  
The code contains an implementation of Dijkstra's algothim for finding the shortest path between two locations. 

Choices:

For the created structure representing the Network, I chose to create the classes:  
* Edge representing the weight between Vertices
* Vertex representing the node/location
* Graph containing the vertices
* Dijkstra containing the algorithm
* Main for setting up the scenario

I chose to create Graph, Vertex, and Edge simply for the reason that it structures the scenario in a natural fashion.  
Dijksta is an brute force algorithm, which secures that the cheapest way from a start to end. The time complexity for it is very crutial, as it does not need large amount of data to become incredebly slow. Therefore, it represents how complex this problem really is.

--------------------------------------------------------------------------------------------------------------------------------------------------

Output:

Shortest Distance between A and B:
10
Path:
A
B

Shortest Distance between A and C:
5
Path:
A
C

Shortest Distance between A and D:
15
Path:
A
E
D

Shortest Distance between A and E:
3
Path:
A
E

Shortest Distance between A and F:
12
Path:
A
F

Shortest Distance between B and C:
15
Path:
B
A
C

Shortest Distance between B and D:
9
Path:
B
D

Shortest Distance between B and E:
13
Path:
B
A
E

Shortest Distance between B and F:
12
Path:
B
F

Shortest Distance between C and D:
15
Path:
C
E
D

Shortest Distance between C and E:
3
Path:
C
E

Shortest Distance between C and F:
12
Path:
C
F

Shortest Distance between D and E:
12
Path:
D
E

Shortest Distance between D and F:
21
Path:
D
B
F

Shortest Distance between E and F:
12
Path:
E
F
