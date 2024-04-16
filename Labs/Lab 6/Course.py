from typing import List

class Course:
    def canFinish(numCourses, prerequisites):
        graph = [[] for _ in range(numCourses)]
        for course, prerequisiteCourse in prerequisites:
            graph[course].append(prerequisiteCourse)
        visited = [0] * numCourses

    def checkCycle(course):
        visited[course] = 1

        for neighbor in graph[course]:
            if visited[neighbor] == 0:
                if checkCycle(neighbor):
                    return True
            elif visited[neighbor] == 1:
                return True

        visited[course] = 2
        return False

    for i in range(numCourses):
        if visited[i] == 0 and checkCycle(i):
            return False

    return True


def test():
    prerequisites1 = [[1, 0]]
    print("Test Case 1:", Course.canFinish(2, prerequisites1))
    prerequisites2 = [[1, 0], [0, 1]]
    print("Test Case 2:", Course.canFinish(2, prerequisites2))

test()
