package strings;

public class FinalValueAfterOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String operations[]={"X++","++X","--X","X--"};
		int x=0;
		for(int i=0;i<operations.length;i++)
        {
            if(operations[i]=="--X")
            {
                x--;
            }
            else if(operations[i]=="X--")
            {
                x--;
            }
            else if(operations[i]=="X++")
            {
                x++;
            }
            else
            {
                x++;
            }

        }
		System.out.println(x);
	}

}
