package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class BFSConnectedComponents {
	int V;
	int E;
	int arr[][];
	
	BFSConnectedComponents(int v, int e)
	{
		V=v;
		E=e;
		arr=new int[V][V];
		for(int i=0;i<V;i++)
		{
			for(int j=0;j<V;j++)
			arr[i][j]=0;
		}
	}
	public void addVertex(int a)
	{
		arr[a][a]=1;
	}
	public void addEdge(int a, int b)
	{
		arr[a][b]=1;
		arr[b][a]=1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=6,e=6;
		BFSConnectedComponents g=new BFSConnectedComponents(v,e);
//		g.addVertex(0);
//		g.addEdge(1, 3);
//		g.addEdge(2, 4);
//		g.addEdge(4, 5);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(3, 5);
		g.addEdge(3, 4);
		g.BFSDis(v);

	}
	public void BFSDis(int V)
	{
		boolean visited[]=new boolean[V];
		int count=0;
		for(int i=0;i<V;i++)
		{
			visited[i]=false;
		}
		for(int i=0;i<V;i++)
		{
			if(!visited[i])
			{
				BFSTraversal(arr,i,visited);
				count++;
			}
		}
		System.out.println("Number of connected components "+count);
	}
	public void BFSTraversal(int arr[][],int source, boolean visited[] )
	{
		Queue<Integer> q=new ArrayDeque<>();
		q.add(source);
		visited[source]=true;
		int u;
		while(!q.isEmpty())
		{
			 u=q.poll();
			//System.out.print(u+" ");
			for(int i=0;i<V;i++)
			{
				if(!visited[i] && arr[u][i]==1  )
				{
					q.add(i);
					visited[i]=true;
					
				}
				
			}
		}
	}

}
