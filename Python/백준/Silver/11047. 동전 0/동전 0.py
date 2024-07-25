import sys
input = sys.stdin.readline

N, K = map(int, input().split()) # N: 동전 종류, K: 목적 합
coins = []

for _ in range(N):
    coins.append(int(input()))

# 내림차순 정렬
coins.sort(reverse=True)

cnt = 0

for coin in coins:
    if K == 0:
        break
    cnt += K // coin
    K %= coin

print(cnt)
