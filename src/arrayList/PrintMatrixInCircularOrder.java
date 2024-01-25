package arrayList;

public class PrintMatrixInCircularOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},
					  {5,6,7,8},
				      {9,10,11,12},
				      {13,14,15,16}};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[0][i]);
		}
		System.out.println();
		for(int i=1;i<arr.length;i++)
		{
			System.out.print(arr[i][arr.length-1]);
		}
		System.out.println();
		for(int i=arr.length-2;i>=0;i--)
		{
			System.out.print(arr[arr.length-1][i]);
		}
		System.out.println();
		for(int i=arr.length-2;i>=1;i--)
		{
			System.out.print(arr[i][0]);
		}
		

	}

}
