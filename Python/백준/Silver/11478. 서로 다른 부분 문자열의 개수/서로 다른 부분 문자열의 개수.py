import sys
input = sys.stdin.readline


cen = input().strip()


l = len(cen)
s = set()


for i in range(1, l+1):
    for j in range(l):
        s.add(cen[j:j+i])


print(len(s))
