package strings;

public class ReverseWordsWithMultipleSpaces {
	public static void main(String[] args)
	{
		String str=" a good example";
		int i=str.length()-1;
		String res="";
		while(i>=0)
		{
			while(i>=0 && str.charAt(i)==' ')
				i--;
			int j=i;
			if(i<0)
				break;
			
			while(i>=0 && str.charAt(i)!=' ')
				i--;
			if(res.isEmpty())
			{
			res=res.concat(str.substring(i+1,j+1));
			}
			else
			{
			res=res.concat(" "+str.substring(i+1,j+1));
			}
			
		}
		System.out.println(res);

	}
}
