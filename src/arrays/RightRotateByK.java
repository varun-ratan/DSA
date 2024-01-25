package arrays;

public class RightRotateByK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3,4,5,6,7};
		int k=3;
	    int j=0;
	      while(j<k)
	      {
	          
	          int temp=nums[nums.length-1];
	          for(int i=nums.length-1;i>0;i--)
	          {
	                  nums[i]=nums[i-1];
	          }
	              nums[0]=temp;
	          j++;
	      }
	      
	      
	      for(int i=0;i<nums.length;i++)
	      {
	    	  System.out.println(nums[i]);
	      }
	        

	}

}
