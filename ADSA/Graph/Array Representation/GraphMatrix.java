import java.util.*;
public class GraphMatrix {
    private int[][] adjMatrix;
    private boolean isDirected;
    private int vertices;

    //Create graph
    public GraphMatrix(int vertices,boolean isDirected) {
        this.vertices = vertices;
        this.isDirected = isDirected;
        adjMatrix = new int[vertices][vertices];
    }
    //add Eges
    public void addEdge(int u ,int v)
    {
        adjMatrix[u][v]=1;
        if(!isDirected)
        {
          adjMatrix[v][u]=1;
        }
    }
    //Display graph
    public void printGraph()
    {
        System.out.println("Adjacency Matrix: ");
        for(int i = 0;i<vertices;i++)
        {
            for(int j = 0;j< vertices;j++)
            {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }    
    //Main Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vertices: ");
        int vertices = sc.nextInt();
        System.out.println("Enter the edges: ");
        int edges = sc.nextInt();
        System.out.println("Is the Graph Directed(true/false): ");
        boolean isDirected = sc.nextBoolean();
        GraphMatrix graph = new GraphMatrix (vertices, isDirected);
        System.out.println("Enter the edges(u,v)");
        for(int i = 0;i<edges;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }
        graph.printGraph();
    }
}
