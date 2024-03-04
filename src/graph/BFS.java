package graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class BFS {
	int V;
	int E;
    int[][] arr;
	BFS(int v,int e)
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
		BFS a=new BFS(6,6);
		a.addEdge(0, 0);
		a.addEdge(0,4);
		a.addEdge(1, 3);
		a.addEdge(3,4);
		a.addEdge(0, 2);
		a.addEdge(4, 5);
		
		a.traversal(0);
		
	}
	int count=0;
	public void traversal(int source)
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
					q.add(i);
					count++;
					visited[i]=true;
					
				}
				
			}
		}
		System.out.println(count);
	}
}
