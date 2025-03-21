
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int start = 1, end = 1, sum=1, count = 0;
        while(start <= n) {
            if ( sum < n ) {
                end++;
                sum+= end;
            } else if ( sum > n ) {
                sum-= start;
                start++;
            } else {
                count++;
                sum-= start;
                start++;
            }
        }
        System.out.println(count);
    }

}