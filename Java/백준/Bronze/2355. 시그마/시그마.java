import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      long a = Long.parseLong(st.nextToken());
      long b = Long.parseLong(st.nextToken());

      if ( a > b ) {
        long tmp = a;
        a = b;
        b = tmp;
      }

      System.out.println( (a + b) * (b - a +1) /2);

    }
}