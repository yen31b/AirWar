package Structures.Demo;

import java.util.LinkedList;

public class Graph {

    LinkedList<Edge>[] adjacencylist;
    int [][] adjMatrix ;
    Node node;

    Graph(Node node) {
        adjacencylist = new LinkedList[node.vertices];
        adjMatrix = new int[node.vertices][node.vertices];

        //initialize adjacency lists for all the vertices
        for (int i = 0; i < node.vertices ; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].addFirst(edge); //for directed graph
    }

    public void printGraph(Node node){
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
