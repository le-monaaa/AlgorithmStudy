import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < t; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for(int i = 0; i < t; i++) System.out.println(arr.get(i));
    }
}