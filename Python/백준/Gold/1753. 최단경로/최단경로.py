import sys
import heapq
input = sys.stdin.readline

V, E = map(int, input().split()) # V: 정점 수, E: 간선 수
K = int(input()) # K: 시작 정점
INF = float('inf')
graph = [[] for _ in range(V+1)]

for i in range(1, E+1):
    u, v, w = map(int, input().split()) # u -> v 가중치 w
    graph[u].append((v, w))

def dijkstra(s):

    distances = [INF] * (V+1)
    distances[s] = 0
    pq = [(0, s)]

    while pq:
        c_d, c_v = heapq.heappop(pq)

        if c_d > distances[c_v]:
            continue

        for neighbor, weight in graph[c_v]:
            distance = c_d + weight

            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(pq, (distance, neighbor))

    return distances[1:]

distance = dijkstra(K)

for i in range(V):
    if distance[i] == INF:
        print("INF")
    else:
        print(distance[i])