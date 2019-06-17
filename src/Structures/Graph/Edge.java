package Structures.Graph;

import java.util.LinkedList;

public class Edge {

    int source;
    int destination;
    // peso de los arcos del grafo
    int danger;
    double distance;
    int terrain;

    public Edge(int source, int destination, int danger) {
        this.source = source;
        this.destination = destination;
        this.danger = danger;
    }

    public Edge(LinkedList<Edge>[] adjList, Node[][] matrix) {
        double dist;
        double[][] localization = new double[2][2];
        for (LinkedList<Edge> lle: adjList) {
            for (Edge e : lle) {
                int src = e.source;
                int dest = e.destination;
                boolean[] cont = new boolean[2];
                if (0 < src && src < adjList[-1].getLast().source) {
                    int i = 0;
                    while (i < matrix.length) {
                        int j = 0;
                        while (j < matrix[i].length) {
                            if (!cont[0] && matrix[i][j].vertices == src) {
                                localization[0][0] = i;
                                localization[0][1] = j;
                                cont[0] = true;
                            }
                            if (!cont[1] && matrix[i][j].vertices == dest) {
                                localization[1][0] = i;
                                localization[1][1] = j;
                                cont[1] = true;
                            }
                            if (cont[0] && cont[1])
                                break;
                            j++;
                        }
                        i++;
                    }
                }
            }
        }
        double x1 = localization[0][0];
        double x2 = localization[0][1];
        double y1 = localization[1][0];
        double y2 = localization[1][1];
        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        this.distance = dist;
    }
}
