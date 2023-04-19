import java.util.ArrayList;
import java.util.Collections;

public class Graph {
    private int øer;
    private ArrayList<Edge> edges;

    public Graph(int øer){
        this.øer = øer;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int a, int b, int c){
        Edge edge = new Edge(a, b, c);
        edges.add(edge);
    }

    public ArrayList<Edge> kruskalMUT(){
        ArrayList<Edge> mut = new ArrayList<>();

        //sorter kanter ift. vægtning
        Collections.sort(edges);
        FællesElement ikkeFællesElement = new FællesElement(øer);

        for (Edge edge : edges) {
            int fraSet = ikkeFællesElement.find(edge.geta());
            int tilSet = ikkeFællesElement.find(edge.getb());

            if (fraSet != tilSet){
                mut.add((edge));
                ikkeFællesElement.union(fraSet, tilSet);
            }
            if (mut.size() == øer -1){
                break;
            }
        }
        return mut;
    }
}
