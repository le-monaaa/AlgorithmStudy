class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for(int i = 1; i <= number; i++) {
            int n = 0;
            if (Math.sqrt(i) == Math.floor(Math.sqrt(i))) n++;
            for(int j = 1; j < Math.sqrt(i); j++){
                if (i % j == 0) n += 2;
            }
            if(n > limit) n = power;
            answer += n;
        }
        return answer;
    }
}