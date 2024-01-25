package arrays;

public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {10,1,2,16,5,28,20};
		
		//Time complexity using below is O(n+n)
//		int max=Integer.MIN_VALUE;
//		for(int i=0;i<a.length;i++)
//		{
//			if(max<a[i])
//			{
//				max=a[i];
//			}
//		}
//		System.out.println("The largest element of given array is "+max);
//		int temp=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(temp<a[i] && a[i]!=max) 
//			{
//				temp=a[i];
//			}
//		}
//		System.out.println("The second largest element of given array is "+temp);
		
		
		
		int first_max,second_max;
		first_max=second_max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first_max)
			{
				second_max=first_max;
				first_max=a[i];
			}
			else if(a[i]>second_max && a[i]!=first_max)
			{
				second_max=a[i];
			}
		}
		if(second_max==Integer.MIN_VALUE)
		{
			System.out.println("There is no second max element in the given array");
		}
		else
		{
			System.out.println("The second max element in the given array is "+second_max);
		}
	}

}
