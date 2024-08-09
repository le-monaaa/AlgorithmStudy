import sys
input = sys.stdin.readline
from collections import deque

N = int(input()) # N: 명령어 수

dq = deque()
for _ in range(N):
    cmd = input()
    if cmd[0] == "1":
        a, b = cmd.split()
        dq.appendleft(b)
    elif cmd[0] == "2":
        a, b = cmd.split()
        dq.append(b)
    elif cmd[0] == "3":
        if len(dq) > 0:
            print(dq.popleft())
        else:
            print("-1")
    elif cmd[0] == "4":
        if len(dq) > 0:
            print(dq.pop())
        else:
            print("-1")
    elif cmd[0] == "5":
        print(len(dq))
    elif cmd[0] == "6":
        if len(dq) == 0:
            print("1")
        else:
            print("0")
    elif cmd[0] == "7":
        if len(dq) > 0:
            print(dq[0])
        else:
            print("-1")
    elif cmd[0] == "8":
        if len(dq) > 0:
            print(dq[-1])
        else:
            print("-1")