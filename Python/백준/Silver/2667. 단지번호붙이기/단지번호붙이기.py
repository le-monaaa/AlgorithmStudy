import sys
input = sys.stdin.readline

graph = []

N = int(input()) # N: 지도 크기
for _ in range(N):
    graph.append(list(map(int, input().strip())))

dx = [-1 , 1, 0, 0]
dy = [0, 0, -1, 1]

cnt = 0
counts = []
def dfs(x, y):
    global cnt

    if x < 0 or x >= N or y < 0 or y >= N:
        return

    if graph[x][y] != 0:
        cnt += 1
        graph[x][y] = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny)

for i in range(N):
    for j in range(N):
        if graph[i][j] == 1:
            dfs(i, j)
            counts.append(cnt)
            cnt = 0

print(len(counts))
counts.sort()

for i in counts:
    print(i)