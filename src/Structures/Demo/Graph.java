package Structures.Demo;

import java.util.LinkedList;

public class Graph {

    LinkedList<Edge>[] adjacencylist;

    Graph(Node node) {
        adjacencylist = new LinkedList[node.vertices];
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

}
