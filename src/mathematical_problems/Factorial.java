package mathematical_problems;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int res=fact(num);
		System.out.println("Factorial of a given number is: " +res);

	}
	public static int fact(int num)
	{
		int res=1;
		if(num==0)
		{
			return 1;
		}
		else
		{
		res=num*fact(num-1);
		}
		return res;
	}

}
