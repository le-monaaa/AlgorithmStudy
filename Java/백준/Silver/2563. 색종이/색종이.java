import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] arr = new int[101][101];
        for(int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            for(int x = a; x < a + 10; x++) {
                for(int y = b; y < b + 10; y++) {
                    arr[x][y] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i = 1; i < 101; i++) {
            for(int j = 1; j < 101; j++) {
                if(arr[i][j] == 1) cnt++;
            }
        }
    System.out.println(cnt);
    }
}