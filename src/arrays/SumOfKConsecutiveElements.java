package arrays;

public class SumOfKConsecutiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {100,200,300,400};
		int k=2;
		int res=0;
		for(int i=0;i<a.length-k;i++)
		{
			int count=0;
			for(int j=i;j<i+k;j++)
			{
				System.out.println(a[j]);
				count=count+a[j];
				//System.out.println(count);
			}
			res=Math.max(res, count);
		}
		
		//System.out.println(res);
	}

}
