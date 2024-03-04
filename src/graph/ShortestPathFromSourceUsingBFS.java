package graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class ShortestPathFromSourceUsingBFS {
	int V;
	int E;
    int[][] arr;
    ShortestPathFromSourceUsingBFS(int v,int e)
	{
		V=v;
		E=e;
		 arr = new int[v][v];
	     for(int row = 0; row < v; row++)
	         Arrays.fill(arr[row], 0);
	}
	public void addEdge(int a,int b)
	{
		arr[a][b]=1;
		arr[b][a]=1;
	}

	public static void main(String []args)
	{
		ShortestPathFromSourceUsingBFS a=new ShortestPathFromSourceUsingBFS(7,6);
		a.addEdge(0, 1);
		a.addEdge(0,2);
		a.addEdge(1, 3);
		a.addEdge(1,4);
		a.addEdge(2, 5);
		a.addEdge(4, 5);
		a.addEdge(5,6);
		int distance[]=new int[7];
		for(int i=0;i<distance.length;i++)
		{
			distance[i]=Integer.MAX_VALUE;
		}
		distance[0]=0;
		a.traversal(0,distance);
		for(int i=0;i<distance.length;i++)
		{
			System.out.print("\n" +"distance of "+ i+" " + distance[i]);
		}
		
	}
	public void traversal(int source,int []distance)
	{
		boolean visited[]=new boolean[V];
		for(int i=0;i<V;i++)
		{
			visited[i]=false;
		}
		Queue<Integer> q=new ArrayDeque<>();
		q.add(source);
		visited[source]=true;
		int u;
		while(!q.isEmpty())
		{
			 u=q.poll();
			System.out.print(u+" ");
			for(int i=0;i<V;i++)
			{
				if(!visited[i] && arr[u][i]==1 )
				{
					distance[i]=distance[u]+1;
					q.add(i);
					visited[i]=true;
					
				}
				
			}
		}
	}
}