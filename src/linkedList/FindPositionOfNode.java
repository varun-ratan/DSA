package linkedList;

public class FindPositionOfNode {

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
		int pos=findPos(head,30);
		System.out.println(pos);
		Traverse t=new Traverse();
		t.traverse(head);

	}
	public static int findPos(Node head, int data)
	{
		if(head==null)
		{
			return -1;
			
		}
	  Node temp=head;
	  int i=1;
	  while(temp!=null && temp.data!=data )
	  {
		  i++;
		  temp=temp.next;
		
	}
	  if(temp==null)
	  {
		  return -1;
	  }
	  return i;

	}

}
