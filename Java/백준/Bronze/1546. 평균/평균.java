import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");

        int[] scores = new int[N];
        for(int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(input[i]);
        }
        double sum = 0;
        long max = 0;
        for(int i = 0; i < N; i++) {
            if(scores[i] > max) max = scores[i];
            sum += scores[i];
        }
        double answer = (sum / max * 100) / N;
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
