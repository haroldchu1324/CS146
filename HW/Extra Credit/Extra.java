import java.util.*;
public class Extra {
    public int[][] listToMatrix(List<List<Integer>> adjacentList) {
        int size = adjacentList.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (int i = 0; i < size; i++)
        {
            for (int j=0; j<adjacentList.get(i).size(); j++)
            {
                adjacencyMatrix[i][j] = 1;
            }
        }
        return adjacencyMatrix;
    }

    public List<List<Integer>> matrixToList(int[][] adjacentMatrix) {
        List<List<Integer>> adjacentList = new ArrayList<>();

        for (int i = 0; i < adjacentMatrix.length; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < adjacentMatrix[0].length; j++)
            {
                if (adjacentMatrix[i][j] == 1)
                {
                    temp.add(j);
                }
            }
            adjacentList.add(temp);
        }

        return adjacentList;
    }

}
