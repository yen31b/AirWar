package Structures.Graph;

import java.util.LinkedList;

public class Matrix {

    Node[][] matrix;

    public Matrix() {

        int rows = 7;
        int columns = 14;
        int[][] coord = {{0,3},{1,1},{4,5},{5,4},{6,2},{7,3},{8,0},{9,3}};
        Node[][] matrix = new Node[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new Node(0, 0);
                for (int num = 0; num < coord.length; num++) {
                    int[] c = coord[num];
                    if (j == c[0] && i == c[1]) {
                        matrix[i][j] = new Node(num + 1, 0);
                        if ((i == 3 && j == 0) || (i == 4 && j == 5) || (i == 3 && j == 9)) {
                            System.out.println(i);
                            System.out.println(j);
                            matrix[i][j].ubication = 1;

                        }
                    }


                }
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
