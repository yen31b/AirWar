package Structures.Demo;

import static algorithms.FloydWarshall.FloydWarshell;

public class Main{

    public static void main(String[] args) {
        Node n = new Node(6, 0);
        Node n1 = new Node(4, 0);
        Graph graph = new Graph(n);
        Graph g = new Graph(n1);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        //graph.printGraph(n);
        Matrix m = new Matrix();
        //m.printMatrix(m.Matrix(graph.adjacencylist));

        //Matriz de adyacencia

        g.addEdgeAdj(0, 0,0);
        g.addEdgeAdj(0, 1,3);
        g.addEdgeAdj(0, 2,9);
        g.addEdgeAdj(0, 3,16);

        g.addEdgeAdj(1, 1,0);
        g.addEdgeAdj(1, 2,10);
        g.addEdgeAdj(1, 3,5);

        g.addEdgeAdj(2, 2,0);
        g.addEdgeAdj(2, 3,4);

        g.addEdgeAdj(3, 1,12);
        g.addEdgeAdj(3, 3,0);

        g.imprimirGrafo();

        FloydWarshell(g.adjMatrix, g.adjMatrix.length);



    }
}
