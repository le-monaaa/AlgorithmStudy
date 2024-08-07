import sys

input = sys.stdin.readline

N, M = map(int, input().split()) # N : 개수, M: 나눌 수

nums = list(map(int, input().split())) # 원본 리스트
D = [0] * N # 합 배열
C = [0] * M # 나머지 깞
cnt = 0

# 구간합 구하기
D[0] = nums[0]
for i in range(1, N):
    D[i] = D[i-1] + nums[i]

# 나눈 값 리스트 구하기
for i in range(N):
    rest = D[i] % M
    if rest == 0:
        cnt += 1
    C[rest] += 1
    
# 조합 구하기
for i in range(M):
    cnt += C[i]*(C[i]-1)/2

print(int(cnt))
