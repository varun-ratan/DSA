package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class CompleteComponentsUsingBFS {
	int V;
	int E;
	int arr[][];
	
	CompleteComponentsUsingBFS(int v, int e)
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
	public void addEdge(int a, int b)
	{
		arr[a][b]=1;
		arr[b][a]=1;
	}
	 public int countCompleteComponents(int n) {
	        int count =0;

	        boolean visited[]=new boolean[n];
	        for(int i=0;i<n;i++)
	        { 
	            visited[i]=false;
	        }
	        for(int i=0;i<n;i++)
	        {
	            if(!visited[i])
	            {
	               boolean temp= BFS(arr,i,visited,n);
	               if(temp==true)
	                    count++;
	            }
	        }
	        return count;
	        
	    }
	    public boolean BFS(int arr[][],int source,boolean visited[] ,int n)
	    {
	        int countNode=0;
	        int countEdge=0;
	        Queue<Integer> q=new ArrayDeque<>();
	        q.add(source);
	        visited[source]=true;
	        while(!q.isEmpty())
	        {
	            int u=q.poll();
	            countNode++;
	           for(int i=0;i<n;i++)
	            {
	                if(arr[u][i]==1)
	                {
	                countEdge++;
	                if(!visited[i])
	                {
	                    q.add(i);
	                    visited[i]=true;
	                }
	                }
	            }
	        }
	        if(countEdge/2==(countNode*(countNode-1))/2)
	           return true;
	        return false;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=6,e=6;
		CompleteComponentsUsingBFS g=new CompleteComponentsUsingBFS(v,e);
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
		int res=g.countCompleteComponents(v);
		System.out.println("Number of complete connected components are "+res);

	}

}


////---------LeetCode solution 

/*    url:  https://leetcode.com/problems/count-the-number-of-complete-components/description/
 * 				n = 6, edges = [[0,1],[0,2],[1,2],[3,4],[3,5]]
				public int countCompleteComponents(int n, int[][] edges) {
				    int count =0;
				    int arr[][]=new int[n][n];
				    for(int i=0;i<n;i++)
				    {
				        for(int j=0;j<n;j++)
				        {
				            arr[i][j]=-1;
				        }
				    }
				    for(int i=0;i<edges.length;i++)
				    {
				        int a=edges[i][0];
				        int b=edges[i][1];
				       arr[a][b]=1;
				       arr[b][a]=1;
				     }
				    boolean visited[]=new boolean[n];
				    for(int i=0;i<n;i++)
				    { 
				        visited[i]=false;
				    }
				    for(int i=0;i<n;i++)
				    {
				        if(!visited[i])
				        {
				           boolean temp= BFS(arr,i,visited,n);
				           if(temp==true)
				                count++;
				        }
				    }
				    return count;
				    
				}
				public boolean BFS(int arr[][],int source,boolean visited[] ,int n)
				{
				    int countNode=0;
				    int countEdge=0;
				    Queue<Integer> q=new ArrayDeque<>();
				    q.add(source);
				    visited[source]=true;
				    while(!q.isEmpty())
				    {
				        int u=q.poll();
				        countNode++;
				       for(int i=0;i<n;i++)
				        {
				            if(arr[u][i]==1)
				            {
				            countEdge++;
				            if(!visited[i])
				            {
				                q.add(i);
				                visited[i]=true;
				            }
				            }
				        }
				    }
				    if(countEdge/2==(countNode*(countNode-1))/2)
				       return true;
				    return false;
				}
*/
