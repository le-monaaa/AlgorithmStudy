import sys
input = sys.stdin.readline
import collections


n = int(input())
q = collections.deque(i for i in range(1, n+1))

while len(q) > 1:
    q.popleft()
    if len(q) == 1:
        break
    a = q.popleft()
    q.append(a)


print(q.pop())