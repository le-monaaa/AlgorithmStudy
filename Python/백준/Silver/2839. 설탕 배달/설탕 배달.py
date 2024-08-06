import sys

input = sys.stdin.readline

N = int(input())

m = N//5

while m > -1:
    remain = N - m * 5

    i = remain % 3

    if i == 0:
        print(m + remain//3)
        break

    else:
        m -= 1

if m < 0:
    print("-1")