import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ab = br.readLine().split(" ");
        System.out.println("a = " + ab[0]);
        System.out.println("b = " + ab[1]);
    }
}