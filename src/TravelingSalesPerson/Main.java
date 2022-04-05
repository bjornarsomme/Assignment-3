package TravelingSalesPerson;

public class Main {

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

        Dijkstra.dijkstraResultPrinter(Dijkstra.dijkstra(graph, timisoara));
        Dijkstra.shortestPathBetween(graph, timisoara, bucharest);
    }
}

/*        sibiu.addEdge(fagaras, 99);
        //fagaras.addEdge(sibiu, 99);
                fagaras.addEdge(bucharest, 211);
        //pitesti.addEdge(rimnicuVilcea, 97);
        //pitesti.addEdge(craiova, 138);
                pitesti.addEdge(bucharest, 101);
        //bucharest.addEdge(fagaras, 211);
        //bucharest.addEdge(pitesti, 101);
                bucharest.addEdge(giurgiu, 90);
                bucharest.addEdge(urziceni, 85);
        //giurgiu.addEdge(bucharest, 90);
        //urziceni.addEdge(bucharest, 85);
                urziceni.addEdge(hirsova, 98);
                urziceni.addEdge(vaslui, 142);
        //hirsova.addEdge(urziceni, 98);
                hirsova.addEdge(eforie, 86);
        //eforie.addEdge(hirsova, 86);
        //vaslui.addEdge(urziceni, 142);
                vaslui.addEdge(iasi, 92);
        //iasi.addEdge(vaslui, 92);
        iasi.addEdge(neamt, 87);
        //neamt.addEdge(iasi, 87);
                oradea.addEdge(zerind, 71);
                oradea.addEdge(sibiu, 151);
        //zerind.addEdge(oradea, 71);
                zerind.addEdge(arad, 75);
        //arad.addEdge(zerind, 75);
                arad.addEdge(sibiu, 140);
                arad.addEdge(timisoara, 118);
        //timisoara.addEdge(arad, 118);
                timisoara.addEdge(lugoj, 111);
        //lugoj.addEdge(timisoara, 111);
                lugoj.addEdge(mehadia, 70);
        //mehadia.addEdge(lugoj, 70);
                mehadia.addEdge(drobeta, 75);
        //drobeta.addEdge(mehadia, 75);
                drobeta.addEdge(craiova, 120);
        //craiova.addEdge(drobeta, 120);
                craiova.addEdge(rimnicuVilcea, 146);
                craiova.addEdge(pitesti, 138);
        //rimnicuVilcea.addEdge(craiova, 146);
                rimnicuVilcea.addEdge(sibiu, 80);
                rimnicuVilcea.addEdge(pitesti, 97);
        //sibiu.addEdge(rimnicuVilcea, 80);
        //sibiu.addEdge(arad, 140);
        //sibiu.addEdge(oradea, 151);
        */
