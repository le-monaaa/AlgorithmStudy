import sys
input = sys.stdin.readline

dx = [-1, 1, 0, 0]
dy = [0, 0, 1, -1]

N = int(input())
graph = []

max_n = 0 # 최대 높이
max_c = 0 # 최대 개수

for _ in range(N):
    li = list(map(int, input().split()))
    if max_n < max(li):
        max_n = max(li)
    graph.append(li)

max_n -= 1
def dfs(x, y):
    stack = [(x, y)]
    visited[x][y] = 1

    while stack:
        cx, cy = stack.pop()

        for i in range(4):
            nx = cx + dx[i]
            ny = cy + dy[i]
            if 0 <= nx < N and 0 <= ny < N and not visited[nx][ny] and graph[nx][ny] > max_n:
                visited[nx][ny] = 1
                stack.append((nx, ny))

while max_n >= 0:

    visited = [[False] * N for _ in range(N)]
    cnt = 0

    for i in range(N):
        for j in range(N):
            # 방문 하지 않은 경우만 탐색
            if not visited[i][j] and graph[i][j] > max_n:
                dfs(i, j)
                cnt += 1


    if cnt > max_c:
        max_c = cnt
    max_n -= 1

print(max_c)
