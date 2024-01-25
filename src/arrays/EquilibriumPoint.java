package arrays;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,4,8,-9,9,7};
//		int leftSum=0;
//		int rightSum=0;
//		for(int i=0;i<a.length;i++)
//		{
//			leftSum=sum(a,0,i);
//			rightSum=sum(a,i+1,a.length);
//			if(leftSum==rightSum)
//			{
//				System.out.println("True"+" " +a[i]);
//			}
//
//		}
		
		int leftSum[]=new int[a.length];
		int rightSum[]=new int[a.length];
		leftSum[0]=a[0];
		rightSum[a.length-1]=a[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			leftSum[i]=a[i]+leftSum[i-1];
		}
		
		for(int i=a.length-2;i>=0;i--)
		{
			rightSum[i]=a[i]+rightSum[i+1];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(leftSum[i]+" "+rightSum[i]);
		}
		
		for(int i=1;i<a.length-1;i++)
		{
			if(leftSum[i-1]==rightSum[i+1])
			{
				System.out.println("True"+a[i]);
			}
		}
		


	}
	public static int sum(int a[],int i,int j)
	{
		int res=0;
		for(int k=i;k<j;k++)
		{
			res=res+a[k];
		}
		return res;
	}


}
