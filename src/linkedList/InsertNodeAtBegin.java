package linkedList;

public class InsertNodeAtBegin {

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
		insertAtBegin(head,60);
		
	}
	public static void insertAtBegin(Node head,int data)
	{
		Node newNode=new Node(data);
		//newNode.next=null;
		if(head==null)
		{
			head=newNode;	
			return;
		}
		newNode.next=head.next;
		head=newNode;
		traverse(head);
		
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
