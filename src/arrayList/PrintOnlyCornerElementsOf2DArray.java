package arrayList;

public class PrintOnlyCornerElementsOf2DArray {
	public static void main(String []args)
	{
		int arr[][]= {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(j==0 || j==arr.length-1)
				{
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(i%2==0)
//			{
//				for(int j=0;j<arr[i].length;j++)
//				{
//					if(j==0 || j==arr.length-1)
//					System.out.print(arr[i][j]);
//				}
//			}
//			else
//			{
//				for(int j=arr[i].length-1;j>=0;j--)
//				{
//					if(j==0 || j==arr.length-1)
//					System.out.print(arr[i][j]);
//				}
//			}
//		}
	}
}
