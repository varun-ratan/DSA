package stacks;

public class MyStack {
	int arr[];
	int capacity;
	int top;
	
	MyStack(int c)
	{
		top=-1;
		capacity=c;
		arr=new int[c];
	}
	void push(int data)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack is full");
		}
		else
		{
			arr[++top]=data;
		}
	}
	
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return 0;
		}

		return arr[top--];
	}

	int peek()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		return arr[top];
	}
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	int size()
	{
		return arr.length;
	}
}
