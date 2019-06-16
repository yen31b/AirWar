package Structures.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printGraph(Graph graph) {
        int src = 0;
        int n = graph.adj.size();

        while (src < n) {
            for (Node edge : graph.adj.get(src)) {
                System.out.print(src + " --> " + edge.value +
                        " (" + edge.weight + ")\t");
            }

            System.out.println();
            src++;
        }
    }

    public static void main (String[] args) {

        List<Edge> edges = Arrays.asList(new Edge(0, 1, 6), new Edge(1, 2, 7),
                new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 10), new Edge(4, 5, 1),
                new Edge(5, 4, 3));


        Graph graph = new Graph(edges);

        printGraph(graph);
    }

}
