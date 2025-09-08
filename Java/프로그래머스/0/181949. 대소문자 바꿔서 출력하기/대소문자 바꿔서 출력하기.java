import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine();
        for(Character s : words.toCharArray()) {
            if(Character.isUpperCase(s)) System.out.print(Character.toLowerCase(s));
            else System.out.print(Character.toUpperCase(s));
        }
    }
}