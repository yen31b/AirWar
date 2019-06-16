package Structures.Demo;

public class Main{

    public static void main(String[] args) {
        Node n = new Node(6, 0);
        Graph graph = new Graph(n);
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 7);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 0, 4);
        graph.addEdge(4, 1, 4);
        graph.addEdge(4, 5, 6);
        graph.printGraph(n);
        Matrix m = new Matrix();
        m.printMatrix(m.Matrix(graph.adjacencylist));
    }
}
