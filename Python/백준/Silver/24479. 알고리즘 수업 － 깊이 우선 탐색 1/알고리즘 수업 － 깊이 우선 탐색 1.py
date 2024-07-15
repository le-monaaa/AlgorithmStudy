import sys
sys.setrecursionlimit(10 ** 6)
input = sys.stdin.readline

N, M, R = map(int, input().split()) # N: 정점수 M: 간선수 R: 시작 정점
graph = [[] for _ in range(N + 1)]
visited = [0] * (N+1)

cnt = 1
def dfs(v, visited):
    global cnt

    visited[v] = cnt

    for i in graph[v]:
        if visited[i] == 0:
            cnt += 1
            dfs(i, visited)

for _ in range(M):
    u, v = map(int, input().split()) # u: 정점 v: 정점. 가중치 1 양방향 간선
    graph[u].append(v)
    graph[v].append(u)

for i in range(N+1):
    graph[i].sort()


dfs(R, visited)


for i in range(1, N+1):
    print(visited[i])