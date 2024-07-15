import sys
input = sys.stdin.readline

N, M, R = map(int, input().split()) # N: 정점, M: 간선, R: 시작 정점
graph = [[] for _ in range(N+1)]

cnt = 1
visited = [0] * (N+1)

# 깊이 우선 탐색 - 재귀 x 스택 사용
def dfs(start):
    global cnt

    stack = [start]

    while stack:
        v = stack.pop()

        if visited[v] == 0:
            visited[v] = cnt
            cnt += 1
            for i in sorted(graph[v], reverse=True):
                if visited[i] == 0:
                    stack.append(i)


for i in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

for i in range(N + 1):
    graph[i].sort()

dfs(R)

for i in range(1, N+1):
    print(visited[i])
