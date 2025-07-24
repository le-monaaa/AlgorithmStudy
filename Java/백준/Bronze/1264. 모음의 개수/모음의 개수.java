import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = br.readLine()) != null) {
            if (line.equals("#")) break;
            int cnt = 0;
            for (char c : line.toLowerCase().toCharArray()) {
                if ( c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                    cnt++;
                }
            }
            
            System.out.println(cnt);
        }
    }
}