package arrays;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={7,9,8,7,8,9,6,5,4,11,18};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j && arr[i]==arr[j])
				{
					arr[j]=-1;
					
				}
			}
		}
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=-1)
			{
				a.add(arr[i]);
			}
		}
		for(int i=0;i<a.size();i++)
		{
			System.out.print(a.get(i)+" ");
		}

	}

}
