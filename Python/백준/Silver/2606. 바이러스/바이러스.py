import sys
input = sys.stdin.readline

N = int(input()) # N: 컴퓨터 수
M = int(input()) # M: 네트워크 연결 쌍 수

graph = [[] for _ in range(N+1)]

for _ in range(M):
    s, e = map(int, input().split())
    graph[s].append(e)
    graph[e].append(s)

for i in range(N+1):
    graph[i].sort()

visited = [0] * (N+1)
def dfs():

    stack = [1]

    while stack:
        node = stack.pop()
        if visited[node] != 1:
            visited[node] = 1
            for i in graph[node]:
                stack.append(i)
dfs()

print(visited.count(1)-1)