package DSA.datastructres.nonlinear.graphs.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFSGraph {
    public List<Integer> bfsGraph(int V,List<List<Integer>> adjList){
        List<Integer> bfs=new ArrayList<>();
        boolean[] visited=new boolean[V+1];
        Queue<Integer> q=new LinkedList<>();
        visited[1]=true;
        q.add(1);
        while (!q.isEmpty()){
            int node=q.poll();
            bfs.add(node);

            for (int neighbours:adjList.get(node)){
                if (!visited[neighbours]){
                    visited[neighbours]=true;
                    q.add(neighbours);
                }
            }
        }
        return bfs;
    }
}
