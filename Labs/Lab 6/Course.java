import java.util.*;
public class Course {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
        {
            graph.add(new ArrayList<>());
        }
        for (int[] temp : prerequisites)
        {
            int course = temp[0];
            int prerequisiteCourse = temp[1];
            graph.get(course).add(prerequisiteCourse);
        }

        int[] visited = new int[numCourses];

        for (int i = 0; i < numCourses; i++)
        {
            if (visited[i] == 0 && checkCycle(graph, i, visited))
            {
                return false;
            }
        }
        return true;
    }

    private boolean checkCycle(List<List<Integer>> graph, int course, int[] visited) {
        visited[course] = 1;

        for (int neighbor : graph.get(course))
        {
            if (visited[neighbor] == 0)
            {
                if (checkCycle(graph, neighbor, visited))
                {
                    return true;
                }
            }
            else if (visited[neighbor] == 1)
            {
                return true;
            }
        }
        visited[course] = 2;
        return false;
    }
    public static void main(String[] args) {
        Course test = new Course();

        int[][] prerequisites1 = {{1, 0}};
        System.out.println("Test Case 1: " + test.canFinish(2, prerequisites1));
        int[][] prerequisites2 = {{1, 0}, {0, 1}};
        System.out.println("Test Case 2: " + test.canFinish(2, prerequisites2));
    }
}
