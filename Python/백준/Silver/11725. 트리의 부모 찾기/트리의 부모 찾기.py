import sys
input = sys.stdin.readline
from collections import deque

def bfs(n, v):

    q = deque([v])
    visited[v] = 1

    while q:
        k = q.popleft()
        for i in n[k]:
            if visited[i] != 1:
                result[i] = k
                q.append(i)
                visited[i] = 1


N = int(input().strip())
graph = [[] for _ in range(N+1)]
visited = [0] * (N+1)
result = [0] * (N+1)

for _ in range(N-1):
    S, D = map(int, input().split())
    graph[S].append(D)
    graph[D].append(S)


bfs(graph, 1)

for i in range(2, N+1):
    print(result[i])