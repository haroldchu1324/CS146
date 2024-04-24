class Solution:
    def minCostToSupplyWater(self, n: int, wells: List[int], pipes: List[List[int]]) -> int:
        edges = []
        for i in range(n):
            edges.append([0, i + 1, wells[i]])  # Virtual node (0) to house (i+1) with cost wells[i]
        for pipe in pipes:
            edges.append(pipe)
        self.customSort(edges)
        parent = [-1] * (n + 1)
        totalCost = 0
        for edge in edges:
            house1, house2, cost = edge
            parent1 = self.find(parent, house1)
            parent2 = self.find(parent, house2)
            if parent1 != parent2:
                parent[parent1] = parent2
                totalCost += cost
        return totalCost
    def customSort(self, edges):
        edges.sort(key=lambda x: x[2])

    def find(self, parent, x):
        if parent[x] == -1:
            return x
        parent[x] = self.find(parent, parent[x])
        return parent[x]
