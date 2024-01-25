package arrays;

public class MaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,10,6,3,8,1};
		int res=0;
		int i=0,j=a.length-1;
		while(i<=j)
		{
			if(a[i]<a[j])
			{
				res=Math.max(res, a[j]-a[i]);
				
				j--;
			}
			else
			{
				i++;
			}
		}
		System.out.println(res);

	}

}
