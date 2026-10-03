
import java.io.*;
import java.util.*;

public class fordFulkerson{

    static int V;
    static long[][] capacity;
    static ArrayList<Integer>[] graph;

    static long bfs(int source, int sink, int[] parent) {
        Arrays.fill(parent, -1);
        parent[source] = source;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);

        while (!queue.isEmpty() && parent[sink] == -1) {
            int u = queue.poll();

            for (int v : graph[u]) {
                if (parent[v] == -1 && capacity[u][v] > 0) {
                    parent[v] = u;
                    queue.offer(v);

                    if (v == sink)
                        break;
                }
            }
        }

        if (parent[sink] == -1)
            return 0;

        long pathFlow = Long.MAX_VALUE;

        for (int v = sink; v != source; v = parent[v]) {
            int u = parent[v];
            pathFlow = Math.min(pathFlow, capacity[u][v]);
        }

        for (int v = sink; v != source; v = parent[v]) {
            int u = parent[v];

            capacity[u][v] -= pathFlow;
            capacity[v][u] += pathFlow;
        }

        return pathFlow;
    }

    static long fordFulkerson(int source, int sink) {
        long maxFlow = 0;
        int[] parent = new int[V];

        while (true) {
            long pathFlow = bfs(source, sink, parent);

            if (pathFlow == 0)
                break;

            maxFlow += pathFlow;
        }

        return maxFlow;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        capacity = new long[V][V];

        graph = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());

            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            long c = Long.parseLong(st.nextToken());

            // Support multiple edges between the same vertices.
            capacity[u][v] += c;

            // Add both directions for the residual graph.
            graph[u].add(v);
            graph[v].add(u);
        }

        int source = 0;
        int sink = V - 1;

        System.out.println(fordFulkerson(source, sink));
    }
}
