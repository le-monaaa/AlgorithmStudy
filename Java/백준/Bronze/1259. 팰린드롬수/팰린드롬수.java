import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String num = br.readLine();
            if ( num.equals("0")) {
                break;
            }
            StringBuffer sb = new StringBuffer(num);
            String reverse = sb.reverse().toString();

            if(num.equals(reverse)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
