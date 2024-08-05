import sys
from collections import deque

input = sys.stdin.readline

T = int(input())


def isEmpty():
    return len(stack) == 0

for _ in range(T):

    stack = deque()

    cmd = list(input().strip())

    for i in cmd:
        if i == "(":
            stack.append(i)
        elif i == ")":
            if isEmpty():
                print("NO")
                break
            else:
                stack.pop()
    else:
        if isEmpty():
            print("YES")
        else:
            print("NO")