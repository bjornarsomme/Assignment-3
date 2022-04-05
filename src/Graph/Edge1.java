package Graph;

import TravelingSalesPerson.Vertex;

import java.util.*;

/**
 * This class is meant for representing the edges, it allows to store
 * the endpoints ids and compare the edges
 */
public class Edge1 {
    /*
     * Instance variables
     */

    private Vertex1 start;
    private Vertex1 end;
    private int weight;

    public Edge1(Vertex1 start, Vertex1 end, int weight){
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public Vertex1 getStart() {
        return start;
    }

    public void setStart(Vertex1 start) {
        this.start = start;
    }

    public Vertex1 getEnd() {
        return end;
    }

    public void setEnd(Vertex1 end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString(){
        return "Weight: " + getWeight() + " Ends: " + getEnd();
    }
}
