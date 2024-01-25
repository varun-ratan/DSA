package strings;

public class Subsequence {
	public static void main(String[] args)
	{
		String s1="GEEKSFORGEEKS";
		String s2="GRGES";
		int i=0,j=0;
		while(i<s1.length() && j<s2.length())
		{
			if(s1.charAt(i)==s2.charAt(j))
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		if(j==s2.length() )
		{
			System.out.println("True");
		}
	}

}
