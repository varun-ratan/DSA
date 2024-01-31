
package arrays;

import java.util.HashMap;

public class FindDuplicateUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,1,1,1,5,6,7,8,2};
	
		HashMap<Integer,Integer> n=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			if(n.containsKey(arr[i]))
			{
				System.out.println(arr[i]);
			}
			else
			{
				n.put(arr[i],1);
			}
		}
		
		for(int i=0;i<n.size();i++)
		{
			System.out.print(n.get(i));
		}
		
		
	
	}

}
