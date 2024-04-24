We create the array with edges and then we add each house add the edge from virtual node to house
with the cost of the building. We also loop through the pipe array to add it to the edge list.
We then sort the edges based on the third element of each edge. This represent the cost. We create
the parent array to represent each node in the disjoint set. All nodes are set to -1 which means
they are root node. The sorted edges are iterated and for each edge the parent nodes of the two
houses it connects are found using the find method. If the houses are not the same component,
the edge is added to the MST and the parent of one house is set to the other. Then the total cost
is updated with cost of current edge.