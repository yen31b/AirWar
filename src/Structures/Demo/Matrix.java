package Structures.Demo;

import java.util.LinkedList;

public class Matrix {

    public Node[][] Matrix(LinkedList<Edge>[] adjacencyList) {

        int rows = 2;
        int columns = 2;
        Node[][] matrix = new Node[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Node(0, 0);
            }
        }

        for (int i = 0; i < adjacencyList.length; i++) {
            int filaRandom = (int)(Math.random()*matrix.length);
            int columnaRandom = (int) (Math.random() * matrix[filaRandom].length);
            if (i < matrix.length && i < matrix[i].length && matrix[filaRandom][columnaRandom].vertices == 0) {
                matrix[filaRandom][columnaRandom].vertices += 5;
            }
        }

        return matrix;
    }

    public void printMatrix(Node[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("v: " + m[i][j].vertices + " u: " + m[i][j].ubication);}
            System.out.println();
        }
    }

}
