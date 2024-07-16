import sys
sys.setrecursionlimit(100000)
input = sys.stdin.readline

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def dfs(x, y):

    if x < 0 or x >= M or y < 0 or y >= N:
        return

    if graph[x][y] != 0:
        graph[x][y] = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            dfs(nx, ny)

T = int(input()) # T: testcase
for _ in range(T):
    M, N, K = map(int, input().split()) # M: 가로, N: 세로, K: 배추 개수

    cnt = 0

    graph = [[0]*N for _ in range(M)]

    for _ in range(K):
        x, y = map(int, input().split())
        graph[x][y] = 1

    for i in range(M):
        for j in range(N):
            if graph[i][j] == 1:
                dfs(i, j)
                cnt += 1

    print(cnt)


