import sys
input = sys.stdin.readline

N, M, R = map(int, input().split()) # N: 정점 수, M: 간선 수, R: 시작 정점

graph = [[] for _ in range(N+1)]
visited = [0] * (N+1)

for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

cnt = 1

def dfs(start):
    global cnt

    stack = [start]
    while(stack):
        v = stack.pop()
        if visited[v] == 0:
            visited[v] = cnt
            cnt += 1
            for i in graph[v]:
                if visited[i] == 0:
                    stack.append(i)

for i in range(0, N+1):
    graph[i].sort()

dfs(R)

for i in range(1, N+1):
    print(visited[i])
