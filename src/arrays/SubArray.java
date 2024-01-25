package arrays;

public class SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,3,1};
		   
		int res=0;
	        int count=0;
	        for(int i=0;i<nums.length
	        		;i+=1)
	        {
	            count=nums[i];
	            for(int j=i+2;j<nums.length;j+=2)
	            {
	                count=count+nums[j];
	                System.out.println(count);
	               
	                System.out.println(res);
	            }
	            res=Math.max(res,count);
	        }
	        System.out.println(res);

	}

}
