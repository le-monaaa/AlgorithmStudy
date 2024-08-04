import sys
import heapq

input = sys.stdin.readline

INF = int(1e9)

# 입력 처리
N, D = map(int, input().split())  # N: 지름길 수, D: 고속도로의 길이

# 거리 배열과 우선순위 큐 초기화
distance = [INF] * (D + 1)
distance[0] = 0
pq = [(0, 0)]  # (현재까지의 거리, 현재 위치)

# 지름길 목록 저장
shortcuts = []
for _ in range(N):
    s, e, l = map(int, input().split()) # s: 시작, e: 끝, l: 길이
    shortcuts.append((s, e, l))

while pq:
    current_dist, u = heapq.heappop(pq) # 현재까지의 거리, 현재 위치 추출

    if current_dist > distance[u]:
        continue

    # 현재 위치+1이 도착점 이전이며 현재까지의 거리+1이 거리배열+1 보다 작을 경우
    # 도로를 따라 이동
    if u + 1 <= D and current_dist + 1 < distance[u + 1]:
        distance[u + 1] = current_dist + 1
        heapq.heappush(pq, (distance[u + 1], u + 1))

    # 지름길 사용
    for s, e, l in shortcuts:
        if s == u and e <= D and current_dist + l < distance[e]:
            distance[e] = current_dist + l
            heapq.heappush(pq, (distance[e], e))

# 결과 출력
print(distance[D])