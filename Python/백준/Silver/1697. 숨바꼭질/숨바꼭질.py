import sys
input = sys.stdin.readline

from collections import deque

N, K = map(int, input().split()) # N: 수빈이의 위치  K: 동생의 위치
max_l = 100001

graph = [0] * max_l

def bfs():

    q = deque([N])

    while q:
        n = q.popleft()

        if n == K:
            break

        for next in (n-1, n+1, n*2):
            if 0 <= next < max_l and not graph[next]:
                graph[next] = graph[n] + 1
                q. append(next)

    print(graph[K])

bfs()
