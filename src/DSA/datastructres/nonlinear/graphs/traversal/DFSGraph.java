package DSA.datastructres.nonlinear.graphs.traversal;

import java.util.ArrayList;
import java.util.List;

class GraphDFS{
    private void dfs(int node, List<List<Integer>> adjList,boolean[] visited,List<Integer> ans){
        visited[node]=true;
        ans.add(node);

        for (int neighbour:adjList.get(node)){
            if (!visited[neighbour]){
                dfs(neighbour,adjList,visited,ans);
            }
        }
    }
    public List<Integer> dfsGraph(int V, List<List<Integer>> adjList){
        boolean[] visited=new boolean[V+1];
        List<Integer> ans=new ArrayList<>();
        int start=1;
        dfs(start,adjList,visited,ans);
        return ans;
    }
}
public class DFSGraph {
    public static void main(String[] args) {
        int v=5;//Number of nodes
        List<List<Integer>> adjList=new ArrayList<>();

        for (int i=0;i<=v;i++){
            adjList.add(new ArrayList<>());
        }
        //Adding the edges(Undirected Graph)
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,4);
        addEdge(adjList,4,5);
        addEdge(adjList,2,5);
        GraphDFS obj=new GraphDFS();
        List<Integer> ans=obj.dfsGraph(v,adjList);
        printBfs(ans);
    }
    public static void addEdge(List<List<Integer>> adjList,int u,int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);//Undirected u<-->v
    }
    public static void printBfs(List<Integer> ans){
        for(int num:ans) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
