package arrays;

public class MaximumConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,1,0,1,1,1,1};
		int temp=0;
		int res=0;
//		for(int i=0;i<a.length-1;i++)
//		{	
//			if(a[i]==1)
//				res=1;
//			else
//				res=0;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]==1 )
//				{
//					res++;
//				}
//				if(a[j]==0)
//				{
//					break;
//				}
//			}
//			if(temp<res)
//			{
//				temp=res;
//				//System.out.println(temp);
//			}
//		}
//		System.out.println(temp);
		
		
		//---------------Try to do it in O(n) time
		int j=0;
		while(j<a.length)
		{
			if(a[j]==0)
			{
				res=0;
			}
			else
			{
				res++;
				temp=Math.max(temp, res);
			
			}

			j++;
		}
		System.out.println(temp);

	}

}
