package NetworkManagement;

import java.util.*;

public class Dijkstra {

    public static Dictionary[] dijkstra(Graph graph, Vertex start){
        Dictionary<String, Integer> distances = new Hashtable<>();
        Dictionary<String, Vertex> previous = new Hashtable<>();
        PriorityQueue<QueueObject> queue = new PriorityQueue<>();
        queue.add(new QueueObject(start, 0));

        for(Vertex v : graph.getVertices()){
            if(v != start){
                distances.put(v.getData(), Integer.MAX_VALUE);
            }
            previous.put(v.getData(), new Vertex("Null"));
        }
        distances.put(start.getData(), 0);

        while(queue.size() != 0){
            Vertex current = queue.poll().getVertex();
            for(Edge edge : current.getEdges()){
                Integer alternate = distances.get(current.getData()) + edge.getWeight();
                String neighborValue = edge.getEnd().getData();
                if(alternate < distances.get(neighborValue)){
                    distances.put(neighborValue, alternate);
                    previous.put(neighborValue, current);
                    queue.add(new QueueObject(edge.getEnd(), distances.get(neighborValue)));
                }
            }
        }
        return new Dictionary[]{distances, previous};
    }

    public static void shortestPathBetween(Graph g, Vertex startingVertex, Vertex targetVertex){
        Dictionary[] dijkstraDicts = dijkstra(g, startingVertex);
        Dictionary distances = dijkstraDicts[0];
        Dictionary previous = dijkstraDicts[1];
        Integer distance = (Integer) distances.get(targetVertex.getData());
        System.out.println("Shortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData() + ":");
        System.out.println(distance);

        ArrayList<Vertex> path = new ArrayList<>();
        Vertex v = targetVertex;
        while(!Objects.equals(v.getData(), "Null")){
            path.add(0,v);
            v = (Vertex) previous.get(v.getData());
        }
        System.out.println("Path:");
        for (Vertex pathVertex: path){
            System.out.println(pathVertex.getData());
        }
        System.out.println();
    }

    public static void dijkstraResultPrinter(Dictionary[] d){
        System.out.println("Distances:\n");
        for (Enumeration keys = d[0].keys(); keys.hasMoreElements();){
            String nextKey = keys.nextElement().toString();
            System.out.println(nextKey + ": " + d[0].get(nextKey));
        }
        System.out.println("\nPrevious:\n");
        for (Enumeration keys = d[1].keys(); keys.hasMoreElements();) {
            String nextKey = keys.nextElement().toString();
            Vertex nextVertex = (Vertex) d[1].get(nextKey);
            System.out.println(nextKey + ": " + nextVertex.getData());
        }
    }

}
