
package arrays;

public class MoveZeroAtEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int arr[]= {1,2,3,0,10,0,20};
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==0)
//			{
//				moveZero(arr,i);
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//
//	}
//	public static void moveZero(int arr [], int index)
//	{
//		int temp=arr[index];
//		for(int i=index;i<arr.length-1;i++)
//		{
//			arr[i]=arr[i+1];
//		}
//		arr[arr.length-1]=temp;
//	}
		int j=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				j=i;
				break;
			}
		}
		for(int i=j;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j++]=temp;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
