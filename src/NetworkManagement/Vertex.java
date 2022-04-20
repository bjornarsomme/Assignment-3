package NetworkManagement;

import java.util.ArrayList;

public class Vertex {

    private ArrayList<Edge> edges;
    private String data;

    public Vertex(String data){
        this.data = data;
        edges = new ArrayList<>();
    }

    public void addEdge(Vertex endVertex, int weight){
        Edge edge = new Edge(this, endVertex, weight);
        edges.add(edge);
    }

    public void removeEdge(Edge edge){
        edges.remove(edge);
    }

    public ArrayList<Edge> getEdges() {
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