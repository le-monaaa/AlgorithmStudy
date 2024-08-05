import sys
from collections import deque

input = sys.stdin.readline

K = int(input())

stack = deque()

for _ in range(K):
    cmd = int(input())

    if cmd == 0:
        stack.pop()
    else:
        stack.append(cmd)


print(sum(stack))
