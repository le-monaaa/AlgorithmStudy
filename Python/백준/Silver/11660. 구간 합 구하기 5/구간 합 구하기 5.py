import sys

input = sys.stdin.readline

N, M = map(int, input().split()) # N: 표의 크기 M: 합을 구해야 하는 횟수

graph = [[0] * (N+1)]
sum_graph = [[0]*(N+1) for k in range(N+1)]


for _ in range(N):
    row = [0] + [int(x) for x in input().split()]
    graph.append(row)

for i in range(1, N+1):
    for j in range(1, N+1):
        sum_graph[i][j] = sum_graph[i][j-1] + sum_graph[i-1][j] - sum_graph[i-1][j-1] + graph[i][j]

for _ in range(M):
    x1, y1, x2, y2 = map(int, input().split())

    res = sum_graph[x2][y2] - sum_graph[x1-1][y2] - sum_graph[x2][y1-1] + sum_graph[x1-1][y1-1]

    print(res)