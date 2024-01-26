package linkedList;

public class DeleteNodeFromBegin {

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
		Node temp=deleteFromBegin(head);
		Traverse t=new Traverse();
		t.traverse(temp);

	}
	public static Node deleteFromBegin(Node head)
	{
		if(head==null)
		{
			return null;
			
		}
	  return head.next;
		
	}

}
