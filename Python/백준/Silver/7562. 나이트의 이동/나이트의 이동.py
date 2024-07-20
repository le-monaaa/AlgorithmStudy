import sys
input = sys.stdin.readline

from collections import deque

dx = [-2, -2, -1, 1, 2, 2, -1, 1]
dy = [-1, 1, -2, -2, -1, 1, 2, 2]

def bfs(x, y, gx, gy):

    q = deque([(x, y)])
    c_b[x][y] = 1

    while q:

        n_x, n_y = q.popleft()

        if (n_x, n_y) == (gx, gy):
            print(c_b[gx][gy] - 1)
            return

        for i in range(8):
            nx = n_x + dx[i]
            ny = n_y + dy[i]

            if 0 <= nx < l and 0 <= ny < l and not c_b[nx][ny]:
                c_b[nx][ny] = c_b[n_x][n_y] + 1
                q.append((nx, ny))

    print(c_b[gx][gy]-1)



T = int(input()) # T: testcase

for _ in range(T):
    l = int(input()) # l: 체스판 한 판의 길이
    nx, ny = map(int, input().split()) # 현재 나이트가 있는 칸
    gx, gy = map(int, input().split()) # 나이트가 이동하려는 칸

    c_b = [[0]* (l) for _ in range(l)]

    bfs(nx, ny, gx, gy)