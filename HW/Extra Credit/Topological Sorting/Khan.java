import java.util.*;

public class Khan
{
    public void topo_sort(List<Integer>[] adj, int n) {
        List<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++)
        {
            for (int con : adj[i])
            {
                list.set(con, list.get(con) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            if (list.get(i) == 0)
            {
                temp.add(i);
            }
        }

        while (!temp.isEmpty())
        {
            int node = temp.poll();
            ans.add(node);
            for (int con : adj[node])
            {
                list.set(con, list.get(con) - 1);
                if (list.get(con) == 0)
                {
                    temp.add(con);
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }
    public void topo_sort_bfs(List<Integer>[] adj, int n)
    {
        List<Integer> list = new ArrayList<>(Collections.nCopies(n, 0));

        for (int i = 0; i < n; i++)
        {
            for (int con : adj[i])
            {
                list.set(con, list.get(con) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        Queue<Integer> temp = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            if (list.get(i) == 0)
            {
                temp.add(i);
            }
        }

        while (!temp.isEmpty())
        {
            int node = temp.poll();
            ans.add(node);

            for (int con : adj[node])
            {
                list.set(con, list.get(con) - 1);

                if (list.get(con) == 0)
                {
                    temp.add(con);
                }
            }
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }

    public void topo_sort_dfs(List<Integer>[] adj, int n) {
        List<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++)
        {
            if (!visited[i])
            {
                dfs(adj, i, visited, stack);
            }
        }

        while (!stack.isEmpty())
        {
            ans.add(stack.pop());
        }

        for (int i = 0; i < n; i++)
        {
            System.out.print(ans.get(i) + " ");
        }
    }

    private void dfs(List<Integer>[] adj, int node, boolean[] visited, Stack<Integer> stack)
    {
        visited[node] = true;
        for (int it : adj[node])
        {
            if (!visited[it])
            {
                dfs(adj, it, visited, stack);
            }
        }
        stack.push(node);
    }


    public static void main(String[] args) {
        int n = 6;
        List<Integer>[] adj = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        addEdge(adj, 3, 0);
        addEdge(adj, 1, 0);
        addEdge(adj, 2, 0);
        addEdge(adj, 2, 3);
        addEdge(adj, 4, 1);
        addEdge(adj, 5, 1);
        addEdge(adj, 1, 0);
        addEdge(adj, 3, 1);
        addEdge(adj, 4, 2);


        Khan sort = new Khan();
        System.out.println("Topological Sort using Khan:");
        sort.topo_sort(adj, n);
        System.out.println();

        System.out.println("Topological Sort using BFS:");
        sort.topo_sort_bfs(adj, n);
        System.out.println();

        System.out.println("Topological Sort using DFS:");
        sort.topo_sort_dfs(adj, n);
    }

    private static void addEdge(List<Integer>[] adj, int u, int v)
    {
        adj[u].add(v);
    }
}
