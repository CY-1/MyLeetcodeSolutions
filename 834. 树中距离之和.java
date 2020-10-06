public class Solution {

  private Set<Integer>[] graph;

  private int[] nodeNum;

  private int[] result;

  public int[] sumOfDistancesInTree(int N, int[][] edges) {
    graph = new Set[N];
    for (int i = 0; i < N; i++) {
      graph[i] = new HashSet<>();
    }
    for (int[] edge : edges) {
      graph[edge[0]].add(edge[1]);
      graph[edge[1]].add(edge[0]);
    }
    nodeNum = new int[N];
    result = new int[N];
    postOrder(0, -1);
    preOrder(0, -1, N);
    return result;
  }

  private void postOrder(int root, int parent) {
    nodeNum[root] = 1;
    for (int next : graph[root]) {
      if (next != parent) {
        postOrder(next, root);
        result[root] += result[next] + nodeNum[next];
        nodeNum[root] += nodeNum[next];
      }
    }
  }

  private void preOrder(int root, int parent, int n) {
    for (int next : graph[root]) {
      if (next != parent) {
        result[next] = result[root] - 2 * nodeNum[next] + n;
        preOrder(next, root, n);
      }
    }
  }

}
