import java.util.stream.IntStream;
class Solution {
    public int solution(int left, int right) {
        return IntStream.rangeClosed(left, right)
                .map(num -> divisorCnt(num) % 2 == 0 ? num : -num)
                .sum();
    }
    private int divisorCnt(int n){
        int cnt = 0;
        for(int i=1; i*i<=n; i++) {
            if(n%i==0) {
                cnt++;
                if(i!=n/i){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}