package linkedList;

public class DeleteNthNodeFromEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		Node temp=deleteNthNodeFromEnd(head,5);
		traverse(temp);
	}
	public static void traverse(Node head)
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}

	public static Node deleteNthNodeFromEnd(Node head,int n)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		temp=head;
		int len=count-n;
		int i=1;
		while(i<len && temp!=null)
		{
			i++;
			temp=temp.next;
		}
		if(count==n)
		{
			return head.next;
		}
		Node cur=temp.next;
		temp.next=temp.next.next;
		return head;

	}

}
