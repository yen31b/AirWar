package Structures.Graph;

import java.util.LinkedList;

import static algorithms.FloydWarshall.FloydWarshell;

public class Main{

    public static void main(String[] args) {
        Matrix m = new Matrix();
        m.printMatrix();
        Node n = new Node(9, 0);
        Graph graph = new Graph(n);
        graph.addEdge(2, 1, 0, m.matrix);
        graph.addEdge(2, 3, 0, m.matrix);
        graph.addEdge(2, 5, 0, m.matrix);
        graph.addEdge(3, 1, 0, m.matrix);
        graph.addEdge(3, 2, 0, m.matrix);
        graph.addEdge(3, 4, 0, m.matrix);
        graph.addEdge(3, 5, 0, m.matrix);
        graph.addEdge(3, 6, 0, m.matrix);
        graph.addEdge(5, 2, 0, m.matrix);
        graph.addEdge(5, 3, 0, m.matrix);
        graph.addEdge(5, 4, 0, m.matrix);
        graph.addEdge(5, 6, 0, m.matrix);
        graph.addEdge(5, 7, 0, m.matrix);
        graph.addEdge(5, 8, 0, m.matrix);
        graph.addEdge(6, 4, 0, m.matrix);
        graph.addEdge(6, 5, 0, m.matrix);
        graph.addEdge(6, 7, 0, m.matrix);
        graph.addEdge(6, 8, 0, m.matrix);
        graph.addEdge(7, 5, 0, m.matrix);
        graph.addEdge(7, 6, 0, m.matrix);
        graph.addEdge(7, 8, 0, m.matrix);
        //graph.printGraph(n);

        for (LinkedList<Edge> lle : graph.adjacencylist) {
            for (Edge e : lle) {
                graph.addEdgeAdj(e.source, e.destination, (int) e.distance);
            }
        }

        graph.imprimirGrafo();
        FloydWarshell(graph.adjMatrix, graph.adjMatrix.length);




        //Matriz de adyacencia (referencia)
    /*
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
