import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] ingre = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            ingre[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ingre);

        int cnt = 0;
        int start_idx = 0;
        int end_idx = N-1;
        while(start_idx < end_idx){
            if(ingre[start_idx] + ingre[end_idx] == M) {
                cnt++;
                start_idx++;
                end_idx--;
            } else if (ingre[start_idx] + ingre[end_idx] > M) {
                end_idx--;
            } else {
                start_idx++;
            }
        }

        System.out.println(cnt);
    }
}