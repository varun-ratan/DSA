package arrays;

public class EqualSumWith3Partition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,6,1,1,1,1,4};
		int lSum=a[0];
		int midSum=0;
		int rSum=0;
		for(int i=1;i<a.length;i++)
		{
			lSum=sum(a,0,i);
			System.out.println(lSum+" "+a[i]);
			midSum=sum1(a,i+1,lSum);
			System.out.println(midSum+" "+a[i]);
			int midIndex=getIndex(a,i+1,lSum);
			System.out.println(midIndex);
			rSum=sum(a,midIndex+1,a.length);
			if(lSum==midSum && midSum==rSum)
			{
				System.out.println("True"+ midIndex);
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
	public static int sum1(int a[],int i,int target)
	{
		int res=0;
		for(int k=i;k<a.length;k++)
		{
			res=res+a[k];
			if(res==target)
			{
				break;
			}
			if(res>target)
			{
				break;
			}
		}
		return res;
	}
	
	public static int getIndex(int a[],int i,int target)
	{
		int res=0,index=0;
		for(int k=i;k<a.length;k++)
		{
			res=res+a[k];
			if(res==target)
			{
				index=k;
				break;
			}
		}
		return index;
		
	}
}
