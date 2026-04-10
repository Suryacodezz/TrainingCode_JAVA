package DSA.datastructres.nonlinear.graphs.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class GraphNodeEdgeCount {
    public static int countNodes(List<List<Integer>> adjList){
        return adjList.size();
    }
    public static int countEdges(List<List<Integer>> adjList){
        int edges=0;
        for(List<Integer> neighbour:adjList){
            edges+=neighbour.size();
        }
        return edges/2;
    }
    public static void main(String[] args) {
        List<List<Integer>> adjList=new ArrayList<>();
        adjList.add(Arrays.asList(1,2));
        adjList.add(Arrays.asList(0,2,3));
        adjList.add(Arrays.asList(0,1,4));
        adjList.add(Arrays.asList(1,4));
        adjList.add(Arrays.asList(2,3));

        int nodes=countNodes(adjList);
        System.out.println("no of nodes: "+nodes);
        int edges=countEdges(adjList);
        System.out.println("no of edges: "+edges);
    }
}
