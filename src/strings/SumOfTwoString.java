package strings;

public class SumOfTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="456";
		String num2="77";
		int a=0,b=0;
		StringBuilder str = new StringBuilder();
		 int i=num1.length()-1,j=num2.length()-1;
//	        String res="";
//	        int carry=0,temp=0;
//	        while(i>=0 || j>=0 || carry>0)
//	        {
//	        	System.out.println("num1.charAt(i) "+num1.charAt(i) +"num2.charAt(j) "+num2.charAt(j));
//	        	if(i>=0)
//	        	 a=num1.charAt(i--);
//	        	if(j>=0)
//	        	{
//	        		b=num2.charAt(j--);
//	        	}
//	            temp=a+b+carry;
//	            str.append(temp % 10);
//	            carry = temp / 10;
////	            j--;
////	            i--;
//	            
//	        }
//	        
	        System.out.println(str.reverse().toString());
	}

}
