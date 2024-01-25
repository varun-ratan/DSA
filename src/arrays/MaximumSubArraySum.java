package arrays;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,-2,3,4};
	     
		int res=maxSubArray(a);

		int newRes=0;
		for(int i=0;i<a.length;i++)
		{
			newRes+=a[i];
			a[i]=-a[i];
			
		}
		int circularSum=newRes+maxSubArray(a);
		
		int finalResult=Math.max(res, circularSum);
		System.out.println(finalResult);
	}
	public static int maxSubArray(int a[])
	{
		int res=a[0],cur=a[0];
		for(int i=1;i<a.length;i++)
		{
			cur=Math.max(a[i], cur+a[i]);
			res=Math.max(res,cur);
		}
	//	System.out.println(res);
		return res;
	}
}
