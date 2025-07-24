import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        if(nums[1]-nums[0] == nums[2] - nums[1]) {
            System.out.println(nums[n-1] + (nums[1] - nums[0]));
        } else {
            System.out.println(nums[n-1] * (nums[1]/ nums[0]));
        }

    }
}