package Structures.Graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    List<List<Node>> adj = new ArrayList<>();

    public Graph(List<Edge> edges)
    {
        for (int i = 0; i < edges.size(); i++)
            adj.add(i, new ArrayList<>());

        for (Edge e : edges)
        {
            adj.get(e.src).add(new Node(e.dest, e.weight));

        }
    }




}
