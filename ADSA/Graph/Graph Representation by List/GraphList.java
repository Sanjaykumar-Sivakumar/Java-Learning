import java.util.*;
public class GraphList {
    private  Map<Integer, List<Integer>> adjlist;
    private boolean isDirected;
    public GraphList(int vertices,boolean isDirected)
    {
        adjlist = new HashMap<>();
        this.isDirected = isDirected;
        for(int i = 0;i<vertices;i++)
        {
            adjlist.put(i,new ArrayList<>());
        }
    }
    //Add Edges
    public void addEdge(int u, int v)
    {
     adjlist.get(u).add(v);
     if(!isDirected)
     {
        adjlist.get(v).add(u);
     }
    }
    //Print 
    public void print()
    {
        for(int vertex : adjlist.keySet())
        {
            System.out.println(vertex + "-->");
            for(int neighbour : adjlist.get(vertex))
            {
                System.out.println(neighbour+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter the edges: ");
        int edges = sc.nextInt();
        System.out.print("Is the graph directed? (true/false): ");
boolean isDirected = sc.nextBoolean();
GraphList graph = new GraphList(vertices, isDirected);
System.out.println("Enter edges (u v): ");
for (int i = 0; i < edges; i++)
{
int u = sc.nextInt();
int v = sc.nextInt();
graph.addEdge(u, v);
}
System.out.println("\nGraph Representation:");
graph.print();
sc.close();
}
}

