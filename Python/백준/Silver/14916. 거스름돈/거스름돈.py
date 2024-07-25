import sys
input = sys.stdin.readline

n = int(input()) # n: 거스름돈 액수

def changes(n):

    # 5원 동전을 최대한 많이 사용
    cnt_5 = n//5
    n %= 5

    # 나머지에 대한 연산(2원으로 나누기)
    # 나머지가 2원으로 나눠지지 않을 경우 5원 동전이 0이 될 때까지 하나씩 줄여 계산
    while cnt_5 >= 0:
        if n % 2 == 0:
            cnt_2 = n //2
            return cnt_5 + cnt_2
        cnt_5 -= 1
        n += 5

    return -1

print(changes(n))