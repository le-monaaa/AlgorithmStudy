import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numsCount = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int value = Integer.parseInt(br.readLine());

        int count = 0;

        for(int i = 0; i < numsCount; i ++) {
            if(Integer.parseInt(nums[i]) == value)
            {
                count += 1;
            }
        }

        System.out.println(count);
    }
}