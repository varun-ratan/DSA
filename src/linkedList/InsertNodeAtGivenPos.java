package linkedList;

public class InsertNodeAtGivenPos {

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
		insertAtPos(head,60,2);
		traverse(head);

	}
	public static void insertAtPos(Node head,int data,int pos)
	{
		Node newNode=new Node(data);
		if(pos==1)
		{
			head=newNode;
			return;
		}
		Node temp=head;
		int i=1;
		while(temp!=null && i<pos)
		{
			temp=temp.next;
			i++;
		}
		if(temp==null)
		{
			return;
		}
			newNode.next=temp.next;
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
