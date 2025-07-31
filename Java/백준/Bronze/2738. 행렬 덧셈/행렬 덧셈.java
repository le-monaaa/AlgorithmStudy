import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int[] sums = new int[n * m];

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for (int j = 0; j < m; j++) {
        sums[i * m + j] = Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < n; i++) {
      st = new StringTokenizer(br.readLine());
      for(int j = 0; j < m; j++) {
        sums[i * m + j] += Integer.parseInt(st.nextToken());
      }
    }

    for (int i = 0; i < n * m; i++) {
      System.out.print(sums[i] + " ");
      if ((i + 1) % m == 0) System.out.println();
    }
  }

}