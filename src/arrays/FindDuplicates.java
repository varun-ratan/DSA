package arrays;

import java.util.Arrays;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int a[] = { 1,2,3,4,1,1,1,5,6,7,8,2};
	        int n = a.length;
	 
	        n = removeduplicates(a, n);
	 
	        // Printing The array elements
	        for (int i = 0; i < n; i++)
	            System.out.print(a[i] + " ");
		
		
		
//		int arr[]= {1,2,3,4,1,1,1,5,6,7,8,2};
//		for(int i=0;i<arr.length;i++)
//		{
//			int count=1;
//			int num=0;
//			for(int j=0;j<arr.length;j++)
//			{
//				if(i!=j && arr[i]==arr[j])
//				{
//					num=arr[i];
//					count++;
//				}
//			}
//			if(count>1)
//			{
//			//System.out.println("Number "+num+ " is repeated "+count+ " times");
//			arr[i]=-1;
//			}
//		}
//		
//		int j=-1;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==-1)
//			{
//				j=i;
//				break;
//			}
//		}
//		for(int i=j+1;i<arr.length;i++)
//		{
//			if(arr[i]!=-1)
//			{
//				int temp=arr[i];
//				arr[i]=arr[j];
//				arr[j]=temp;
//				j++;
//			}
//		}
//		int res=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]!=-1)
//			{
//				res++;
//			}
//		}
//		for(int i=0;i<res;i++)
//		{
//			System.out.println(arr[i]);
//		}

	}
	
	

    public static int removeduplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }
        Arrays.sort(a);
 
        // creating another array for only storing
        // the unique elements
//        int[] temp = new int[n];
//        int j = 0;
// 
//        for (int i = 0; i < n - 1; i++) {
//            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
//            }
//        }
// 
//        temp[j++] = a[n - 1];
// 
//        // Changing the original array
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }
       int j=0;
        for(int i=0;i<a.length-1;i++)
        {
        	if(a[i]!=a[i+1])
        	{
        		a[j++]=a[i];
        	}
        }
        a[j++]=a[a.length-1];
        return j;
    }

}
