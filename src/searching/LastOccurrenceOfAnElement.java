package searching;

public class LastOccurrenceOfAnElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,3,3,6};
		int target=3;
		int res=findTarget(a,0,a.length,target);
		System.out.println(res);
	}
	public static int findTarget(int a[],int low,int high,int n)
	{
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(a[mid]==n)
			{
				if(a[mid+1]==n || mid==0)
				{
					low=mid+1;
				}
				else
				{
					return mid;
				}
			}
			else if(a[mid]>n)
			{
				high=mid-1;
			}
			else if(a[mid]<n)
			{
				low=mid+1;
			}
		}
		return -1;
	}


}
