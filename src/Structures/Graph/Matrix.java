package Structures.Graph;

import java.util.LinkedList;

public class Matrix {

    Node[][] matrix;
    LinkedList<Edge>[] adjacencyList;

    public Matrix(LinkedList<Edge>[] adjacencyList) {

        this.adjacencyList = adjacencyList;

        int rows = 1400;
        int columns = 700;
        int[][] coordPorta = {{}};
        int[][] coordAero = {{450,400},{680,250},{900,100},{750,400},{230,150},{100,400},{600,500},{1000,400}};
        Node[][] matrix = new Node[rows][columns];
        int cont = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int[] p : coordPorta) {
                    if (i == p[0] && j == p[1]) {
                        matrix[i][j] = new Node(cont, 1);
                        cont++;
                    }
                }
                for (int[] a : coordAero) {
                    if (i == a[0] && j == a[1]) {
                        matrix[i][j] = new Node(cont, 0);
                        cont++;
                    }
                }
                matrix[i][j] = new Node(0, 0);
            }
        }

        this.matrix = matrix;
    }

    public void printMatrix() {
        for (Node[] nodes : matrix) {
            for (Node node : nodes) {
                System.out.println("v: " + node.vertices + " u: " + node.ubication);
            }
            System.out.println();
        }
    }
}
