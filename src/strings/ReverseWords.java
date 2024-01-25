package strings;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a good   example";
		char ch[]=str.toCharArray();
		int start=0;
		String s="";
		for(int end=ch.length-1;end>=0;end--)
		{
			if(ch[end]!=' ')
			{
				s=s+ch[end];
			}
			if(ch[end]==' ')
			{
				reverse(ch,start ,end-1);
				start=end+1;

			}
			//end++;
			
		}
		reverse(ch,start,ch.length-1);
		reverse(ch,0,ch.length-1);
		String res=new String(ch);
		System.out.println(res);

	}

	public static void reverse(char ch[],int start,int end)
	{
	//char ch[]=str.toCharArray();
		while(start<=end)
		{
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		//str=new String(ch);
	}

}
