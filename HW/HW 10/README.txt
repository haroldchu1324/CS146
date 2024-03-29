The level order method will be using BFS traversal using a queue. The complete list will be used
to store the correctly ordered nodes. The levelSize will determine the number of nodes in the current
level. Currentlevel will be used to store all the values from the nodes in the current level.
If the dequeued node has a child, we will queue them to visit later. Then we return the list that contains
the values of the current level.