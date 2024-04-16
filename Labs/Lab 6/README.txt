The canFinish method will create an empty graph for the adjacency list. It will iterate
through the prerequisites array and add the prerequisite course for each course. Then it
will create a visited array to keep track of visited nodes during the DFS. The checkCycle
will be performing the DFS traversal. If the node is visited, it will be marked by 1 and
recursively check the neighbors. If it finds a neighbor where the value is 1 it means that
it is a cycle and will return true. If it finishes visiting and cannot find a cycle, it marks
the current course as 2 and returns false. When no cycle is found the canFinish method will
return true.