import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Problem> list = new ArrayList<>();

    for(int i = 0; i < 8; i++){
      int score = Integer.parseInt(br.readLine());
      list.add(new Problem(i+1, score));
    }
    list.sort((a, b) -> b.score - a.score);

    int sum = 0;
    List<Integer> selected = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      sum += list.get(i).score;
      selected.add(list.get(i).index);
    }

    Collections.sort(selected);

    System.out.println(sum);
    for (int num : selected) {
      System.out.print(num + " ");
    }
  }

  static class Problem {
    int index;
    int score;
    public Problem(int index, int score) {
      this.index = index;
      this.score = score;
    }
  }
}