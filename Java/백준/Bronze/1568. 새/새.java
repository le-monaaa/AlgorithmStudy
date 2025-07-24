import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        int i = 1;

        while(n > 0) {
            if ( n == 0 ) break;
            if( n - i < 0) {
                i = 1;
            } else {
                n -= i;
                i++;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}