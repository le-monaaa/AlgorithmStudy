import sys
input = sys.stdin.readline

from collections import deque

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

N, M = map(int, input().split()) # N lines M nums

graph = []

for _ in range(N):
    graph.append(list(map(int, input().strip())))

def bfs():

    q = deque([(0, 0)])

    while q:
        x, y = q.popleft()

        # 끝에 도달할 경우
        if (x, y) == (N-1, M-1):
            break

        # 사방탐색
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if 0 <= nx < N and 0 <= ny < M and graph[nx][ny] == 1:
                graph[nx][ny] = graph[x][y] + 1
                q.append((nx, ny))

    return graph[N-1][M-1]

print(bfs())