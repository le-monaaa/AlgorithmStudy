import sys
input = sys.stdin.readline

N = int(input()) # N번째 영화

n = 665
cnt = 0
while True:

    if N == cnt:
        break
    n += 1

    if "666" in str(n):
        cnt += 1


print(n)