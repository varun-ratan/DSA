package arrays;

public class LongestSubArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,10,13,14};
		//if number starts with even then next number must be odd or vice-versa
		
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int res=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j-1]%2==0 && arr[j]%2!=0)
				{
					res++;
				}
				if(arr[j-1]%2!=0 && arr[j]%2==0)
				{
					res++;
				}
				if(arr[j-1]%2==0 && arr[j]%2==0)
				{
					break;
				}
			}
			temp=Math.max(temp, res);
			
		}
		System.out.println(temp);

	}

}
