package Structures.Graph;

import static algorithms.FloydWarshall.FloydWarshell;

public class Main{

    public static void main(String[] args) {
        Node n = new Node(8, 0);
        Graph graph = new Graph(n);
        graph.addEdge(2, 1, 4);
        graph.addEdge(2, 3, 3);
        graph.addEdge(2, 5, 2);
        graph.addEdge(3, 1, 5);
        graph.addEdge(3, 2, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 4);
        graph.addEdge(3, 6, 4);
        graph.addEdge(5, 2, 6);
        graph.addEdge(5, 3, 6);
        graph.addEdge(5, 4, 6);
        graph.addEdge(5, 6, 6);
        graph.addEdge(5, 7, 6);
        graph.addEdge(5, 8, 6);
        graph.addEdge(6, 4, 6);
        graph.addEdge(6, 5, 6);
        graph.addEdge(6, 7, 6);
        graph.addEdge(6, 8, 6);
        graph.addEdge(7, 5, 6);
        graph.addEdge(7, 6, 6);
        graph.addEdge(7, 8, 6);
        graph.printGraph(n);
        Matrix m = new Matrix(graph.adjacencylist);
        m.printMatrix();

        //Matriz de adyacencia
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
