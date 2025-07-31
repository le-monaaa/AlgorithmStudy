import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
  static List<Integer>[] graph;
  static boolean[] visited;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken()); // 정점 수
    int m = Integer.parseInt(st.nextToken()); // 간선 수
    int v = Integer.parseInt(st.nextToken()); // 시작노드
    graph = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
      graph[i] = new ArrayList<>();
    }

    for (int i = 0; i < m; i++) {
      StringTokenizer line = new StringTokenizer(br.readLine());
      int s = Integer.parseInt(line.nextToken());
      int e = Integer.parseInt(line.nextToken());
      graph[s].add(e);
      graph[e].add(s);
    }

    for (int i = 1; i <= n; i++) {
      Collections.sort(graph[i]);
    }

    visited = new boolean[n+1];
    dfs(v);
    System.out.println();
    visited = new boolean[n+1];
    bfs(v);

  }

  static void dfs(int node) {
    visited[node] = true;
    System.out.print(node + " ");

    for(int next : graph[node]) {
      if (!visited[next]) {
        dfs(next);
      }
    }
  }

  static void bfs(int start) {
    Queue<Integer> q = new LinkedList<>();
    visited[start] = true;
    q.offer(start);

    while(!q.isEmpty()) {
      int node = q.poll();
      System.out.print(node + " ");

      for(int next : graph[node]) {
        if (!visited[next]) {
          visited[next] = true;
          q.offer(next);
        }
      }
    }
  }

}