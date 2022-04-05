package Graph;

import TravelingSalesPerson.Graph;
import TravelingSalesPerson.Vertex;

import java.io.File;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Graph graph = new Graph();

        Vertex oradea = graph.addVertex("Oradea");
        Vertex zerind = graph.addVertex("Zerind");
        Vertex arad = graph.addVertex("Arad");
        Vertex sibiu = graph.addVertex("Sibiu");
        Vertex timisoara = graph.addVertex("Timisoria");
        Vertex lugoj = graph.addVertex("Lugoj");
        Vertex mehadia = graph.addVertex("Mehadia");
        Vertex drobeta = graph.addVertex("Drobeta");
        Vertex craiova = graph.addVertex("Craiova");
        Vertex rimnicuVilcea = graph.addVertex("Rimnicu Vilcea");
        Vertex fagaras = graph.addVertex("Fagaras");
        Vertex pitesti = graph.addVertex("Pitesti");
        Vertex bucharest = graph.addVertex("Bucharest");
        Vertex giurgiu = graph.addVertex("Giurgiu");
        Vertex urziceni = graph.addVertex("Urziceni");
        Vertex hirsova = graph.addVertex("Hirsova");
        Vertex eforie = graph.addVertex("Eforie");
        Vertex vaslui = graph.addVertex("Vaslui");
        Vertex iasi = graph.addVertex("Iasi");
        Vertex neamt = graph.addVertex("Neamt");

        graph.addEdge(oradea, zerind, 71);
        graph.addEdge(oradea, sibiu, 151);
        graph.addEdge(zerind, arad, 75);
        graph.addEdge(arad, sibiu, 140);
        graph.addEdge(arad, timisoara, 118);
        graph.addEdge(timisoara, lugoj, 111);
        graph.addEdge(lugoj, mehadia, 70);
        graph.addEdge(mehadia, drobeta, 75);
        graph.addEdge(drobeta, craiova, 120);
        graph.addEdge(craiova, rimnicuVilcea, 146);
        graph.addEdge(craiova, pitesti, 97);
        graph.addEdge(rimnicuVilcea, sibiu, 80);
        graph.addEdge(rimnicuVilcea, pitesti, 97);
        graph.addEdge(sibiu, fagaras, 99);
        graph.addEdge(fagaras, bucharest, 211);
        graph.addEdge(pitesti, bucharest, 101);
        graph.addEdge(bucharest, giurgiu, 90);
        graph.addEdge(bucharest, urziceni, 85);
        graph.addEdge(urziceni, hirsova, 98);
        graph.addEdge(urziceni, vaslui, 142);
        graph.addEdge(hirsova, eforie, 86);
        graph.addEdge(vaslui, iasi, 92);
        graph.addEdge(iasi, neamt, 87);

    }
}
