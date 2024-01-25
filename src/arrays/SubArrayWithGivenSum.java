package arrays;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,4,20,3,10,5};
		int sum=33;
//		int res=sum;
//		for(int i=0;i<a.length;i++)
//		{
//			int count=0;
//			for(int j=i;j<a.length;j++)
//			{
//				count+=a[j];
//				if(count ==sum)
//				{
//					System.out.println("Yes SubArrayWithGivenSum is present from index "+i+" to index "+j);
//					break;
//				}
//			}
//		}
	
		
		
		///Using Sliding Window Technique
		
		int s=0,count=0;
		for(int e=0;e<a.length;e++)
		{
			count+=a[e];
			while(sum<count)
			{
				count-=a[s];
				s++;
			}
			if(count==sum)
			{
				System.out.println("Yes SubArrayWithGivenSum is present from index "+s+" to index "+e);
			}
		}

	}

}
