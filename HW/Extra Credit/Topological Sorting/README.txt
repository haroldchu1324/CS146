Khan algorithm prioritizes the nodes with in-degree 0 and removes them because these can be visited
first. The in-degree will be calculated for each node. All the in-degree 0 will be added to the queue
and will be dequeued to the sorted array. This will continue by going to the neighboring nodes with
in-degree 0 and will be repeated.
The BFS method is also similar where we calculate the in-degree of each node. BFS will visit each level
of the nodes starting with in-degree 0. Everytime it visits the node, it will decreases the neighboring
nodes. If they become 0 it will be added to the queue.
DFS selects a random node and attempts to go as far as possible. When it is finished searching, it is
added to the sorted order and will perform this recursively. 