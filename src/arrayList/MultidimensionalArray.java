package arrayList;

import java.util.ArrayList;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
		
		for(int i=0;i<arr.size();i++)
		{
			;
			for(int j=0;j<arr.get(i).size();i++)
			{
				arr.get(i).add(j);
			}
		}
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<arr.get(i).size();i++)
			{
				System.out.println(arr.get(i).get(j));
			}
		}

	}

}
