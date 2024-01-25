package strings;

public class PalindromeCheck {
	public static void main(String []args)
	{
		String s="ABCDCBA";
		int i=0,j=s.length()-1;
		while(i<=j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j--;
			}
			else
			{
				System.out.println("Not a palindrome");
			}
		}
		System.out.println("Given string  is a palindrome"
				+ "");
	}

}
