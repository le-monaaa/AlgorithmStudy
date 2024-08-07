import sys

input = sys.stdin.readline

dx = [-1, -1, -1, 0, 0, 1, 1, 1]
dy = [-1, 0, 1, -1, 1, -1, 0, 1]

def dfs(sx, sy, graph):

    stack = [(sx, sy)]
    graph[sx][sy] = 0

    while stack:
        x, y = stack.pop()
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < h and 0 <= ny < w and graph[nx][ny] == 1:
                graph[nx][ny] = 0
                stack.append((nx, ny))

while True:
    w, h = map(int, input().split()) # w, h: 지도의 너비와 높이

    if w == 0 and h == 0:
        break

    graph = []
    for _ in range(h):
        graph.append(list(map(int, input().split())))

    cnt = 0

    for i in range(h):
        for j in range(w):
            if graph[i][j] == 1:
                dfs(i, j, graph)
                cnt += 1

    print(cnt)