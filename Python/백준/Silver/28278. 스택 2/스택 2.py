import sys
from collections import deque

input = sys.stdin.readline

N = int(input())
stack = deque()

def isEmpty():
    if len(stack) == 0:
        return True
    return False

for _ in range(N):

    code = input().rstrip().split()
    if code[0] == "1":
        stack.append(int(code[-1]))
    elif code[0] == "2":
             if isEmpty():
                 print("-1")
             else:
                 print(stack.pop())
    elif code[0] == "3":
        print(len(stack))
    elif code[0] == "4":
        if isEmpty():
            print("1")
        else:
            print("0")
    elif code[0] == "5":
        if isEmpty():
            print("-1")
        else:
            print(stack[-1])
