package NetworkManagement;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();

        Vertex a = graph.addVertex("A");
        Vertex b = graph.addVertex("B");
        Vertex c = graph.addVertex("C");
        Vertex d = graph.addVertex("D");
        Vertex e = graph.addVertex("E");
        Vertex f = graph.addVertex("F");

        graph.addEdge(a, b, 10);
        graph.addEdge(a, c, 5);
        graph.addEdge(a, d, 9999);
        graph.addEdge(a, e, 3);
        graph.addEdge(a, f, 12);

        graph.addEdge(b, c, 17);
        graph.addEdge(b, d, 9);
        graph.addEdge(b, e, 17);
        graph.addEdge(b, f, 12);

        graph.addEdge(c, d, 35);
        graph.addEdge(c, e, 3);
        graph.addEdge(c, f, 12);

        graph.addEdge(d, e, 9999);
        graph.addEdge(d, e, 12);

        graph.addEdge(e, f, 12);

        Dijkstra.shortestPathBetween(graph, a, b);
        Dijkstra.shortestPathBetween(graph, d, f);
        Dijkstra.shortestPathBetween(graph, c, e);
        Dijkstra.shortestPathBetween(graph, f, a);
    }
}
