package arrays;

public class FindFirstAndLastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {5,7,7,8,8,10};
		int target=8;
		  int startInd=Integer.MAX_VALUE;
	        int lastInd=0;
	        for(int i=0;i<nums.length;i++)
	        {
	        	if(nums[i]==target)
	        	{
	        		startInd=Math.min(startInd,i);
	        		lastInd=i;
	        	}
	        }
	        System.out.println(startInd+" "+lastInd);

	}

}
