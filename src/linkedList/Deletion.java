package linkedList;

public class Deletion {
	public static void main(String []args)
	{
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		deletion(head, 30);
		traverse(head);
	}
	public static void deletion(Node head, int data)
	{
		Node n=head;
		//Node prev=head;
		while(n!=null)
		{
			if(n.next.data==data)
			{
				break;
			}
			n=n.next;
		}
		n.next=n.next.next;
	}
	
	public static void traverse(Node head)
	{
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data +" ");
			n=n.next;
		}
	}
	

}
