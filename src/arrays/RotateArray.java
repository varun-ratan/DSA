package arrays;

import java.util.ArrayList;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int d=2;
		 int i=0;
		    while(i<d)
		    {
		         int temp=arr.get(arr.size()-1);
		        for(int j=0;i<arr.size()-1;j++)
		        {
		        	int a=arr.get(j);
		            arr.set(j+1,a);
		           
		        }
		        arr.set(i,temp);
		        i++;
		    }
		    for(int j=0;j<arr.size();j++)
		    {
		    	System.out.println(arr.get(j));
		    }

	}

}
