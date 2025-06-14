import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        int cnt = 0;

        for(int k = 0; k < N; k++) {
            long find = arr[k];
            int i = 0;
            int j = N-1;
            while(i < j) {
                if (arr[i] + arr[j] == find) {
                    if (i != k && j != k) {
                        cnt++;
                        break;

                    } else if (i == k) {
                        i++;
                    } else {
                        j--;
                    }
                } else if(arr[i] + arr[j] < find) {
                    i++;
                } else{
                    j--;
                }
            }
        }
        System.out.println(cnt);
    }
}