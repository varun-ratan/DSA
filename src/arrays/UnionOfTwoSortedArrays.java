package arrays;

public class UnionOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,5,8};
		int b[]= {2,8,9,10,15};
		int i=0,j=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]==b[j])
			{
				System.out.print(a[i]+" "+b[j]+" ");
				i++;
				j++;
			}
			else if(a[i]>b[j])
			{
				System.out.print(b[j]+" ");
				j++;
			}
			else
			{
				System.out.print(a[i]+" ");
				i++;
			}
		}
	//	System.out.println(i+" "+j);
		while(i<a.length)
		{
			System.out.print(a[i++]+" ");
		}
		while(j<b.length)
		{
			System.out.print(b[j++]+" ");
		}

	}

}
