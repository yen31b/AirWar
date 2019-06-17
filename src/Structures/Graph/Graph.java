package Structures.Graph;

import java.util.LinkedList;

public class Graph {

    LinkedList<Edge>[] adjacencylist;
    int [][] adjMatrix ;

    Graph(Node node) {
        adjacencylist = new LinkedList[node.vertices];
        adjMatrix = new int[node.vertices][node.vertices];

        //initialize adjacency lists for all the vertices
        for (int i = 0; i < node.vertices ; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int danger, Node[][] matrix) {
        double dist;
        double[][] localization = new double[2][2];
        boolean[] cont = new boolean[2];
        int i = 0;
        while (i < matrix.length) {
            int j = 0;
            while (j < matrix[i].length) {
                if (!cont[0] && matrix[i][j].vertices == source) {
                    localization[0][0] = i;
                    localization[0][1] = j;
                    cont[0] = true;
                }
                if (!cont[1] && matrix[i][j].vertices == destination) {
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
        double x1 = localization[0][0];
        double x2 = localization[0][1];
        double y1 = localization[1][0];
        double y2 = localization[1][1];
        dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Edge edge = new Edge(source, destination, danger, dist);
        adjacencylist[source].addFirst(edge); //for directed graph
    }

    public void printGraph(Node node) {
        for (int i = 0; i < node.vertices ; i++) {
            LinkedList<Edge> list = adjacencylist[i];
            for (int j = 0; j <list.size() ; j++) {
                System.out.println(i + " --> " + list.get(j).destination + " W(" + list.get(j).danger + ")\t");
            }
        }
    }

    public void addEdgeAdj(int i, int j, int weight) {

        if(i==j){
            adjMatrix[i][j] = Integer.MAX_VALUE;
        }
        if(weight == 0){
            adjMatrix[i][j] = Integer.MAX_VALUE;
        }
        else{
            adjMatrix[i][j] = weight;
            adjMatrix[j][i] = weight;
        }
    }


    public void imprimirGrafo(){
        System.out.printf("  %d" , 0);
        for (int i = 1; i < adjMatrix.length; i++) {
            System.out.printf(" %d" , i);
        }
        System.out.println();

        for(int i = 0; i < adjMatrix.length; i++){
            System.out.printf("%d ",i);
            for(int j = 0; j < adjMatrix[i].length; j++){
                System.out.printf("%d " , adjMatrix[i][j]);
            }
            System.out.println();
        }
    }



}
