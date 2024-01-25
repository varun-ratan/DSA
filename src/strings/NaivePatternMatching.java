package strings;

public class NaivePatternMatching {
	public static void main(String[] args)
	{
		String txt="GEEKSFORGEEKS";
		String pat="EKS";
		int N=txt.length();
		int M=pat.length();
	    for(int i=0;i<=N-M;)
	    {
	    	int j=0;
	    	for(j=0;j<M;j++)
	    	{
	    		if(txt.charAt(i+j)!=pat.charAt(j))
	    		{
	    			break;
	    		}
	    	}
	    	if(j==M)
	    	{
	    		System.out.println("The given pattern is present in the given string "+ i);
	    	}
	    	if(j==0)
	    	{
	    		i++;
	    	}
	    	else
	    	{
	    		i=i+j;
	    	}
	    }
    }
	
    
}


