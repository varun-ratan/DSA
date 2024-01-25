package searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int target=4;
		int res=findTarget(a,0,a.length,target);
		System.out.println(res);

	}
	public static int findTarget(int a[],int low,int high, int n)
	{
		//int res=0;
		//------------Iterative Approach
//		while(low<high)
//		{
//			int mid=(low+high)/2;
//			if(a[mid]==n)
//				return mid;
//			else if(a[mid]<n)
//				high=mid-1;
//			else if(a[mid]>n)
//				low=mid+1;
//			else
//				return -1;
//		}
//		return -1;
		
		if(low>high)
		{
			return -1;
		}
		//------------Recursive Approach
		int mid=(low+high)/2;
		if(a[mid]==n)
			return mid;

		else if(a[mid]<n)
			findTarget(a,low,mid-1,n);
		else 
			findTarget(a,mid+1,high,n);
	
		return -1;
		
	}

}
