1. Given an adjacency list, how can you convert it to an adjacency matrix?
A 2D array will be created with the size of the list. It will go through the list and fill
in the 2D array with 1 based on the node it states that it is connected to from the adjacency
list.

2. Given an adjacency matrix, how can you convert it to an adjacency list?
We will create a List with List<Integer> as it's element. We will traverse through the matrix
to find the position that has the value of 1 and add that to the list. Once the row is finished,
it will continue to the next row and each row will have a new List<Integer> created to add to the
complete List.

3. Given a directed graph, how can you reverse the direction of each edge?
A new graph will be created and it will mirror and inverse the rows and column.
pseudocode:
public List reverseGraph(List graph){
    List reversed = new ArrayList
    for(int i=0;i<graph.size;i++)
    {
        for(int j=0;j<graph.get(v).size;j++)
        {
            int temp=graph.get(v).get(i);
            reversed.get(temp).add(graph)
        }
    }
}