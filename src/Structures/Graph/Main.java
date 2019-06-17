package Structures.Graph;

import java.util.LinkedList;

import static algorithms.FloydWarshall.FloydWarshell;

public class Main{

    public static void main(String[] args) {

        Matrix m = new Matrix();
        m.printMatrix();
        Node n = new Node(8, 0);
        Graph graph = new Graph(n);
        int i = 0;
        while (i < 8) {
            int j = 0;
            while (j < 8) {
                graph.addEdge(i, j, 0, m.matrix);
                j++;
            }
            i++;
        }
        /*
        graph.addEdge(1, 0, 0, m.matrix);
        graph.addEdge(1, 2, 0, m.matrix);
        graph.addEdge(1, 3, 0, m.matrix);
        graph.addEdge(1, 4, 0, m.matrix);
        graph.addEdge(2, 0, 0, m.matrix);
        graph.addEdge(2, 1, 0, m.matrix);
        graph.addEdge(2, 3, 0, m.matrix);
        graph.addEdge(2, 4, 0, m.matrix);
        graph.addEdge(2, 5, 0, m.matrix);
        graph.addEdge(4, 1, 0, m.matrix);
        graph.addEdge(4, 2, 0, m.matrix);
        graph.addEdge(4, 3, 0, m.matrix);
        graph.addEdge(4, 4, 0, m.matrix);
        graph.addEdge(4, 6, 0, m.matrix);
        graph.addEdge(4, 7, 0, m.matrix);
        graph.addEdge(5, 3, 0, m.matrix);
        graph.addEdge(5, 4, 0, m.matrix);
        graph.addEdge(5, 6, 0, m.matrix);
        graph.addEdge(5, 7, 0, m.matrix);
        graph.addEdge(6, 4, 0, m.matrix);
        graph.addEdge(6, 5, 0, m.matrix);
        graph.addEdge(6, 7, 0, m.matrix);
        */

        //graph.printGraph(n);

        for (LinkedList<Edge> lle : graph.adjacencylist) {
            for (Edge e : lle) {
                graph.addEdgeAdj(e.source, e.destination, e.totalWeight);
                System.out.println(e.totalWeight);
            }
        }

        graph.imprimirGrafo();
        FloydWarshell(graph.adjMatrix, graph.adjMatrix.length);




        //Matriz de adyacencia (referencia)

/*
        Node n1 = new Node(4, 0);
        Graph g = new Graph(n1);

        g.addEdgeAdj(0, 0,0);
        g.addEdgeAdj(0, 1,3);
        g.addEdgeAdj(0, 2,9);
        g.addEdgeAdj(0, 3,16);

        g.addEdgeAdj(1, 1,0);
        g.addEdgeAdj(1, 2,10);
        g.addEdgeAdj(1, 3,5);

        g.addEdgeAdj(2, 2,0);
        g.addEdgeAdj(2, 3,4);


        g.imprimirGrafo();

        FloydWarshell(g.adjMatrix, g.adjMatrix.length);

*/

    }
}
