package arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDuplicates {
	public static void main(String[] args)
	{
		int arr[]= {3, 4, 12, 3, 12, 3, 4, 4, 12, 7, 11, 6, 5};
		int n=arr.length;
		ArrayList<Integer> list=new ArrayList<>();
System.out.println(list.size());
	        Arrays.sort(arr);
	       int j=0;
	        for(int i=0;i<n-1;i++)
	        {
	            if(arr[i]!=arr[i+1])
	            {
	                arr[j++]=arr[i];
	            }
	            else if(!list.contains(arr[i]))
	            {
	            list.add(arr[i+1]);
	            }
	            
	            
	        }
	        arr[j++]=arr[n-1];
	        if(list.size()==0)
	        {
	        	list.add(-1);
	        }
	        System.out.println(list);
//	        for()
//	        if(j==n)
//	        {
//	            list.add(-1);
//	        }
//	        else
//	        {
//	        while(j<n)
//	        {
//	            list.add(arr[j++]);
//	        }
//	        }
//	        System.out.println(list);
	}

}
