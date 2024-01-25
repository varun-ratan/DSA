package mathematical_problems;
import java.util.*;
public class Fibonacci {

	//0 1 1 2 3 5 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int num=sc.nextInt();
		int res=fib(num);
		System.out.println("Fibonacci of given number is : "+ res);

	}
	public static int fib(int n)
	{
		if(n==0 )
		return 0;
		else if(n==1 || n==2)
		return 1;
		else
		return fib(n-1)+fib(n-2);
		
	}

}
