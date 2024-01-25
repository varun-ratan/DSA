package linkedList;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	Node newHead=reversal(head);
	traverse(newHead);

	}
	public static Node reversal(Node head)
	{
		if(head==null)
		{
			return head;
		}
	   Node curr=head;
	   Node prev=null;
	 
	   while(curr!=null)
	   {
		   Node next=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=next;
	   }
		return prev;
		
	}
	
	public static void traverse(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}


}
