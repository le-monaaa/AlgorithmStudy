import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pos = 1;
        
        for (int i = 0; i < n; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            
            if (pos == x) {
                pos = y;
            } else if ( pos == y) {
                pos = x;
            }
        }
        
        System.out.println(pos);
    }
}