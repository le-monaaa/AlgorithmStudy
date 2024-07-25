import sys
input = sys.stdin.readline

N = int(input()) # N: 문제 수
colors = input() # color: 그냥 순서대로 풀면 안되나요

def count_min(n, c):
    B_cnt = 0
    R_cnt = 0

    if c[0] == "B":
        B_cnt += 1
    else:
        R_cnt += 1

    for i in range(1, n):
        if c[i] != c[i-1]:
            if c[i] == "B":
                B_cnt += 1
            else:
                R_cnt += 1

    return min(B_cnt, R_cnt) + 1

print(count_min(N, colors))