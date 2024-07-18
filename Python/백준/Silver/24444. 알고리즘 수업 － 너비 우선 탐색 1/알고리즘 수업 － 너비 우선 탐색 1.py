import sys
input = sys.stdin.readline

from collections import deque

def bfs(V, E, R):

    Q = deque([R])
    cnt = 2
    
    while Q:
        u = Q.popleft()

        for v in sorted(E[u]):
            if not visited[v]:
                visited[v]= cnt
                cnt += 1
                Q.append(v)

    return visited

N, M, R = map(int, input().split()) # N: 정점 수, M: 간선 수, R: 시작 정점

graph = [[] for _ in range(N+1)]

visited = [0] * (N+1)
visited[R] = 1

for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

bfs(N, graph, R)

for i in range(1, N+1):
    print(visited[i])