package linkedList;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node head=n1;
		head.next=n2;
		n2.next=null;
		traverse(head);

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
