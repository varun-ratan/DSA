package strings;

public class LeftMostRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="geeksforgeeks";
		int index=0;
		int res=Integer.MAX_VALUE;
		for(int i=0;i<str.length()-1;i++)
		{
			index=i;
			//res=i;
			int flag=0;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
                  System.out.println(i);
                  flag=1;
                  break;
				}
			}
			if(flag==1)
				break;
		}
		//System.out.println(res);
	}

}
