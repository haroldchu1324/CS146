import java.util.*;

public class Solution {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            edges.add(new int[]{0, i + 1, wells[i]});
        }

        for (int[] pipe : pipes)
        {
            edges.add(pipe);
        }

        customSort(edges);

        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);

        int totalCost = 0;

        for (int[] edge : edges)
        {
            int house1 = edge[0], house2 = edge[1], cost = edge[2];
            int parent1 = find(parent, house1), parent2 = find(parent, house2);

            if (parent1 != parent2)
            {
                parent[parent1] = parent2;
                totalCost += cost;
            }
        }

        return totalCost;
    }

    private void customSort(List<int[]> edges) {
        Collections.sort(edges, new Comparator<int[]>()
        {
            public int compare(int[] a, int[] b)
            {
                return Integer.compare(a[2], b[2]);
            }
        });
    }
    private int find(int[] parent, int x)
    {
        if (parent[x] == -1) return x;
        return parent[x] = find(parent, parent[x]);
    }
}
