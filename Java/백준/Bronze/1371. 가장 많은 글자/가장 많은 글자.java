import java.io.*;

public class Main {
    public static void main(String[] agrs) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] freq = new int[26];
        
        
        String line;
        while((line = br.readLine()) != null) {
            for(char c: line.toCharArray()) {
                if ( c >= 'a' && c <= 'z') {
                    freq[c-'a']++;
                }
            }
        }
        
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] > max) {
                max = freq[i];
            }
        }
        
        for (int i = 0; i < 26; i++) {
            if (freq[i] == max) {
                System.out.print((char)(i + 'a'));
            }
        }
    }
}