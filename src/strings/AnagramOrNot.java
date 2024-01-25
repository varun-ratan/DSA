package strings;

public class AnagramOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="anagram";
		String b="margana";
		 a=a.toLowerCase();
	        b=b.toLowerCase();
	        String s[]=null;
	        String s1[]=null;
	         s=a.split("");
	         s1=b.split("");
	        
	        if(a.length()!=b.length())
	        {
	           System.out.println("Not Anagrams");
	        }
	        
	        for(int i=0;i<s.length-1;i++)
	        {
	            for(int j=i+1;j<s.length;j++)
	            {
	                if(s[i].compareTo(s[j])>0)
	                {
	                    String temp=s[i];
	                    s[i]=s[j];
	                    s[j]=temp;
	                    
	                    
	                }
	            }
	        }
	        for(int i=0;i<s1.length-1;i++)
	        {
	            for(int j=i+1;j<s1.length;j++)
	            {
	                if(s1[i].compareTo(s1[j])>0)
	                {
	                    String temp=s1[i];
	                    s1[i]=s1[j];
	                    s1[j]=temp;
	                    
	                    
	                }
	            }
	        }
	        for(int i=0;i<s.length;i++)
	        {
	        	System.out.println(s[i]+" "+s1[i]);
	        }
	        int flag=0;
	        for(int i=0;i<s.length;i++)
	        {
	            if(s[i]!=s1[i])
	            {
	                flag=1;
	                break;
	            }
	       
	        }
	        if(flag==1)
	        {
	        	System.out.println("Not Anagrams");
	        }
	        else
	        {
	        	System.out.println("Anagrams");
	        }
	       

	}

}
