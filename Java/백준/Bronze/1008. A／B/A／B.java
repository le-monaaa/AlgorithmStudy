import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        
        System.out.println(A / B);
    }
}