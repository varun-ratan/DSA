package sortingAlgorithms;

public class SelectionSort {
	public static void main(String[] args)
	{
		int a[]= {10,5,8,20,2,18};
		//The idea is to take minimum and put it into starting
		
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[i])
				{
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
