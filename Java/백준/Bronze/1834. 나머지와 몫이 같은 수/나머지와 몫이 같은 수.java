import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        
        long sum = 0;
        for (long q = 1; q < N; q++) {
            sum += q * (N+1);
        }
        System.out.print(sum);
    }
}