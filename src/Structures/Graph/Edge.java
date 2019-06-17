package Structures.Graph;

import java.util.LinkedList;

public class Edge {

    int source;
    int destination;
    // peso de los arcos del grafo
    int danger;
    double distance;
    int terrain;

    public Edge(int source, int destination, int danger, double distance) {
        this.source = source;
        this.destination = destination;
        this.danger = danger;
        this.distance = distance;
    }

}
