import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = 0;
        int y = 0;
        int max = 0;
        for(int i = 1; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 1; j < 10; j++) {
                int nm = Integer.parseInt(st.nextToken());
                if(nm >= max) {
                    x = i;
                    y = j;
                    max = nm;
                }
            }
        }
        
        System.out.println(max);
        System.out.println(x + " " + y);
    }
}