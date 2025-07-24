import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception{
        Map<Character, Integer> octoMap = new HashMap<>();
        octoMap.put('-', 0);
        octoMap.put('\\', 1);
        octoMap.put('(', 2);
        octoMap.put('@', 3);
        octoMap.put('?', 4);
        octoMap.put('>', 5);
        octoMap.put('&', 6);
        octoMap.put('%', 7);
        octoMap.put('/', -1);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(!(input = br.readLine()).equals("#")) {
            int result = 0;
            int length = input.length();
            
            for ( int i = 0; i < length; i++) {
                char c = input.charAt(i);
                int value = octoMap.get(c);
                result += value * Math.pow(8, length-i-1);
            }
            System.out.println(result);
        }
    }
}