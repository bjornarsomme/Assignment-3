package Graph;

import java.util.ArrayList;

/**
 *      The Nodes of the Graph. Represents the cities.
 */
public class Vertex1 {

    private ArrayList<Edge1> edges;
    private String data;

    public Vertex1(String data){
        this.data = data;
        edges = new ArrayList<>();
    }

    public void addEdge(Vertex1 endVertex, int weight){
        Edge1 edge = new Edge1(this, endVertex, weight);
        edges.add(edge);
    }

    public ArrayList<Edge1> getEdges() {
        return edges;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString(){
        return getData();
    }

}
