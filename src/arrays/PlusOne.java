package arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int digits[]= {1,2,9};
		int res[]=plusOne(digits);
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]);
		}

	}
public static int[] plusOne(int digits[])
{
	 int n=digits[digits.length-1];
     
     n=n+1;
     int rev=0;
   
     int last=digits[digits.length-1];
     if(last>=9)
     {
    	 digits[digits.length-2]=digits[digits.length-2]+1;
    	 digits[digits.length-1]=0;
         return digits;
     }
     else
     {
         digits[digits.length-1]= digits[(digits.length-1)]+1;
          return digits;
     }
}
}
