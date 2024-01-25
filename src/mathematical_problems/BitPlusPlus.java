package mathematical_problems;

import java.util.Scanner;
public class BitPlusPlus
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int X=0;
String s;
while(n>0)
{
s=sc.next();
System.out.println(n);
if(s.contentEquals("X++") || s.contentEquals("++X"))
{
X=X+1;
System.out.println(X);
}
if(s=="X--" || s=="--X")
{
X=X-1;
System.out.println(X);
}
n--;
}
System.out.println(X);

}
}