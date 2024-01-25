package mathematical_problems;
import java.util.*;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number a : ");
		int a=sc.nextInt();
		System.out.println("Enter number b : ");
		int b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Number after performing swap operation is "+ a + " " +b);
		

	}

}
