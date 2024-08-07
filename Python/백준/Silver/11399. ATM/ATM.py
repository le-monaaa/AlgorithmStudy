import sys

input = sys.stdin.readline

N = int(input())
times = sorted(list(map(int, input().split())))

res = 0

for i in range(N+1):
    res += sum(times[0:i])
print(res)