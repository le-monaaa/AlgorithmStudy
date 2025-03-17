import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        String n = br.readLine();
        int answer = 0;
        for(int i=0; i < t; i++) {
            answer += n.charAt(i) - '0';
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}