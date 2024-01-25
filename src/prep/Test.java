package prep;

public class Test {
	public static void main(String []args)
	{
		int arr[]= {2,3,1,4};
	   int a[]= {2,2,2,1};
	   int b[]=new int[arr.length];
	 
//	   for(int i=0;i<arr.length;i++)
//	   {
//		   int count=0;
//		   for(int j=0;j<a.length;j++)
//		   {
//			   if(arr[i]==a[j] || arr[i]>a[j])
//			   {
//				count++;   
//			   }
//		   }
//		   b[i]=count;
//	   }
	   for(int i=0;i<arr.length;i++)
	   {
	   int count=findCount(arr[i],a,0,a.length);
	   System.out.println(count);
	   }
	   
	}
	
	public static int findCount(int val,int a[],int i,int j)
	{
		int mid=(i+j)/2;
		int count=0;
		if(a[mid]==val)
		{
			count++;
		}
		if(a[mid]<=val)
		{
			count++;
			findCount(val,a,i,mid-1);
		}
		return count;
	}
	

	

}
