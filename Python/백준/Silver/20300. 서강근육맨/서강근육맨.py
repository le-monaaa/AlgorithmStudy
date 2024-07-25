import sys
input = sys.stdin.readline

n = int(input()) # n: 운동 기구의 개수
Li = list(map(int, input().split())) # 각 운동 기구 별 근손실 정도

def exercise(n):

    Li.sort() # 오름차순 정렬

    # 홀수라면 최댓값 제외 연산
    if n % 2 != 0:
        max_loss = Li[n-1]

        for i in range(n//2):
            max_loss = max(max_loss, Li[i] + Li[n-2-i])

    # 짝수라면 그대로 연산
    else:
        max_loss = 0
        for i in range(n//2):
            max_loss = max(max_loss, Li[i] + Li[n-1-i])

    return max_loss

print(exercise(n))