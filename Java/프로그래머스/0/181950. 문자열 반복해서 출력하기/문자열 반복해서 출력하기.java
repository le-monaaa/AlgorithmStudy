import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        for(int i = 0; i < Integer.parseInt(inputs[1]); i++) System.out.print(inputs[0]);
    }
}