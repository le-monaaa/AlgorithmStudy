import sys
input = sys.stdin.readline

from collections import deque

def dfs(V): # V: 시작 정점

    stack = [V]
    visited = []

    while stack:
        n = stack.pop()

        if n not in visited:
            visited.append(n)

            for i in sorted(graph[n], reverse=True):
                if i not in visited:
                    stack.append(i)

    print(" ".join(map(str, visited)))

def bfs(V): # V: 시작 정점

    q = deque([V])
    visited = []

    while q:
        n = q.popleft()

        if n not in visited:
            visited.append(n)

        for i in sorted(graph[n]):
            if i not in visited:
                q.append(i)

    print(" ".join(map(str, visited)))

N, M, V = map(int, input().split()) # N: 정점 수, M: 간선 수, V: 시작 정점

graph = [[] for _ in range(N+1)]

for _ in range(M):
    u, v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)


# 중복제거
for i in range(1, N+1):
    graph[i] = list(set(graph[i]))

dfs(V)
bfs(V)
