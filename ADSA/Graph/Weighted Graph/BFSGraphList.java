import java.util.*;

class Edge {
    int dest;
    int weight;
    Edge(int dest, int weight) {
        this.dest = dest;
        this.weight = weight;
    }
}
public class BFSGraphList {
    private final Map<Integer, List<Edge>> adjList;
    private final boolean isDirected;
    private String[] labels;

    public BFSGraphList(int vertices, boolean isDirected) {
        adjList = new HashMap<>();
        this.isDirected = isDirected;
        labels = new String[vertices];
    }

    public void setLabels(String[] labels) {
        this.labels = labels;
    }

    public void addEdge(int u, int v, int weight) {
        adjList.putIfAbsent(u, new ArrayList<>());
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.get(u).add(new Edge(v, weight));
        if (!isDirected) {
            adjList.get(v).add(new Edge(u, weight));
        }
    }

    public void printGraph() {
        System.out.println("\nGraph Representation (Adjacency List):");
        for (int vertex : adjList.keySet()) {
            System.out.print(labels[vertex] + " -> ");
            for (Edge edge : adjList.get(vertex)) {
                System.out.print("(" + labels[edge.dest] + ", w=" +
                        edge.weight + ") ");
            }
            System.out.println();
        }
    }

    // BFS Traversal
    public void bfs(int start) {
        boolean[] visited = new boolean[labels.length];
        Queue<Integer> queue = new LinkedList<>();
        visited[start] = true;
        queue.add(start);
        System.out.print("\nBFS Traversal starting from " + labels[start] + ": ");
        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(labels[node] + " ");
            for (Edge edge : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!visited[edge.dest]) {
                    visited[edge.dest] = true;
                    queue.add(edge.dest);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        System.out.print("Is the graph directed? (true/false): ");
        boolean isDirected = sc.nextBoolean();
        BFSGraphList graph = new BFSGraphList(vertices, isDirected);
        System.out.println("Enter labels for vertices (like A B C ...): ");
        String[] labels = new String[vertices];
        for (int i = 0; i < vertices; i++) {
            labels[i] = sc.next();
        }
        graph.setLabels(labels);
        System.out.println("Enter edges (u v weight) using labels:");
        for (int i = 0; i < edges; i++) {
            String uLabel = sc.next();
            String vLabel = sc.next();
            int weight = sc.nextInt();
            int u = Arrays.asList(labels).indexOf(uLabel);
            int v = Arrays.asList(labels).indexOf(vLabel);
            graph.addEdge(u, v, weight);
        }
        graph.printGraph();
        System.out.print("\nEnter starting node for BFS: ");
        String startLabel = sc.next();
        int start = Arrays.asList(labels).indexOf(startLabel);
        graph.bfs(start);
        sc.close();
    }
}