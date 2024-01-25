package linkedList;

public class InsertNodeAtEnd {

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
		insertAtEnd(head,90);
		traverse(head);
	}
	public static void insertAtEnd(Node head, int data)
	{
		Node newNode=new Node(data);
		Node temp=head;
		if(head==null)
		{
			head=newNode;
		}
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=newNode;
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

}
