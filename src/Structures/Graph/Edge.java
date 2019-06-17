package Structures.Graph;

import java.util.LinkedList;

public class Edge {

    int source;
    int destination;
    // peso de los arcos del grafo
    int danger;
    int distance;
    int terrain;
    int totalWeight;

    public Edge(int source, int destination, int danger, int distance, int terrain) {
        this.source = source;
        this.destination = destination;
        this.danger = danger;
        this.distance = distance;
        this.terrain = terrain;
        this.totalWeight = danger + distance + terrain;
    }

}
