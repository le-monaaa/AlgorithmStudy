import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        double num1 = Double.parseDouble(nums[0]);
        double num2 = Double.parseDouble(nums[1]);
        double result = num1/num2;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter((System.out)));
        bw.write(result +"");
        bw.flush();
        bw.close();
    }
}