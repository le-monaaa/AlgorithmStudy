import java.io.*;
import java.util.Stack;

public class Main{
  public static void main(String[] args) throws Exception{
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  int[] arr = new int[T];
  for(int i = 0; i < T; i++) {
    arr[i] = Integer.parseInt(br.readLine());
  }
  Stack<Integer> stack = new Stack<>();
  StringBuffer sb = new StringBuffer();
  int num = 1;
  boolean result = true;
  for(int i = 0; i < T; i++) {
    int sn = arr[i];
    if (sn >= num) {
      while(sn >= num) {
        stack.push(num++);
        sb.append("+\n");
      }
      stack.pop();
      sb.append("-\n");
    }
    else {
      int n = stack.pop();
      if (n > sn) {
        System.out.println("NO");
        result = false;
        break;
      }
      else {
        sb.append("-\n");
      }
    }
  }
  if (result) System.out.println(sb.toString());
  }
}