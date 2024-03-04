package stacks;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,30,10,5,15};
		int res[]=new int[arr.length];
		int j=0;
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<arr.length;i++)
		{

			int max=1;
			
			while(!stack.isEmpty())
			{
				if(stack.peek()<=arr[i]) {
					max++;
					System.out.println(stack.peek());
					stack.pop();
				}
				else
				{
					break;
				}

			}
			res[j++]=max;
			stack.push(arr[i]);
			
			
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(res[i]);
		}



	}

}
