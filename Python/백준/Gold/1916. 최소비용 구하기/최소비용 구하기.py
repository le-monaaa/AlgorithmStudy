import sys
import heapq

input = sys.stdin.readline

INF = int(1e9)

N = int(input()) # N: 도시의 수
M = int(input()) # M: 버스의 수

graph = [[] for _ in range(N+1)]

for _ in range(M):
    s, e, l = map(int, input().split()) # s: 출발 e: 도착 l: 비용
    graph[s].append((e, l))

S, E = map(int, input().split())

distance = [INF] * (N+1)
distance[S] = 0

pq = [(0, S)] # 현재 거리, 시작 도시

while pq:
    c_d, c_c = heapq.heappop(pq) # 현재 거리, 현재 위치

    # 현 노드까지의 거리보다 더 긴 경로는 무시
    if c_d > distance[c_c]:
        continue

    # 현재 노드에서 방문할 수 있는 경로 탐색
    for neighbor, cost in graph[c_c]:
        neighbor_dis = c_d + cost

        # 만약 현재 거리+비용이 distance에 저장된 값보다 작다면 갱신, q에 삽입
        if neighbor_dis < distance[neighbor]:
            distance[neighbor] = neighbor_dis
            heapq.heappush(pq, (neighbor_dis, neighbor))

print(distance[E])