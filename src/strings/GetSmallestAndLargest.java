package strings;

import java.util.ArrayList;
import java.util.Collections;

public class GetSmallestAndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String  has the following lexicographically-ordered substrings of length :
//
//			We then return the first (lexicographically smallest) substring and the last (lexicographically largest) substring as two newline-separated values (i.e., ava\nwel).
//
//			The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

//		Sample Input 0
//		welcometojava
//		3
//		
//		Sample Output 0
//		ava
//		wel
		
		String s="welcometojava";
		int k=3;
		 ArrayList<String> a=new ArrayList<>();
	       // for(int i=0;i<s.length()-k;i++)
	       // {
	            for(int j=0;j<=s.length()-k;j++)
	            {
	                int q=j;
	                String temp="";
	                while(q<j+k)
	                {
	                    temp=temp+s.charAt(q);
	                    q++;
	                }
	                a.add(temp);
	               // System.out.println(temp +" " +a.get(i)+ " ");
	            }
	       // }
	            Collections.sort(a);
	        for(int i=0;i<a.size();i++)
	        {
	        	System.out.println(a.get(i)+ " ");
	        }
	        
	        String smallest=a.get(0);
	        String largest=a.get(a.size()-1);
	        System.out.println("Smallest String "+smallest+" "+ "Largest String "+ " "+largest);
	}

}
