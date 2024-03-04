package graph;

import java.util.ArrayList;

public class DFS {
	int V;
	int E;
	ArrayList<ArrayList<Integer>> adj;
	
	DFS(int v,int e)
	{
		V=v;
		E=e;
		adj=new ArrayList<>();
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<>());
		}
	}
	
	public void addEdge(int a,int b)
	{
		ArrayList<Integer> list=new ArrayList<>();
		list.add(a);
		list.add(b);
		adj.get(a).add(b);
		adj.get(b).add(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=6,e=6;
		DFS g=new DFS(v,e);
		g.addEdge(0, 1);
		g.addEdge(1, 3);
		g.addEdge(3, 5);
		g.addEdge(0, 5);
		g.addEdge(0, 2);
		g.addEdge(2, 4);	
		g.DFSTraversal(v,0);
	}
	public void DFSTraversal(int V,int source)
	{
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			visited[i]=false;
		}
		DFSRec(adj,source,visited);
	}
	public void DFSRec(ArrayList<ArrayList<Integer>> adj, int source, boolean[] visited)
	{
		visited[source]=true;
		System.out.println(source+" ");
		for(int u:adj.get(source))
		{
			if(!visited[u])
			{
				DFSRec(adj,u,visited);	
			}
		}
	}

}
