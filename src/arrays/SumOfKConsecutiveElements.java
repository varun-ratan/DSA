package arrays;

public class SumOfKConsecutiveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,8,30,-5,20,7};
		int k=3;
		int res=0;
		for(int i=0;i<a.length-k;i++)
		{
			int count=0;
			for(int j=i;j<i+k;j++)
			{
				count=count+a[j];
			}
			res=Math.max(res, count);
		}
		
		System.out.println(res);
	}

}
