package NetworkManagement;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;

    public Graph(){
        vertices = new ArrayList<>();
    }

    public Vertex addVertex(String data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex start, Vertex end, int weight) {
        start.addEdge(end, weight);
        end.addEdge(start, weight);
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }
}
