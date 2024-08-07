import sys

input = sys.stdin.readline

N = int(input())
nums = list(map(int, (list(input().strip()))))

print(sum(nums))