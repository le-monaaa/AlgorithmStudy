import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        long num1 = Long.parseLong(nums[0]);
        long num2 = Long.parseLong(nums[1]);
        long num3 = Long.parseLong(nums[2]);

        long result = num1 + num2 + num3;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        bw.write(result +"");
        bw.flush();
        bw.close();
    }
}