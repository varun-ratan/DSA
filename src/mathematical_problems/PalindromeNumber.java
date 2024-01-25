package mathematical_problems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		boolean res=checkPalindrome(num);
		System.out.println("Given number is palindrome : " +res);
	}
	public static boolean checkPalindrome(int num)
	{
		
		int n=num;
		int sum=0;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
		}
		if(sum==num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
