package linkedList;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node head=n1;
		head.next=n2;
		n2.next=null;
		insert(head,30);

	}
	public static void insert(Node head, int data)
	{
		Node addNew=new Node(data);
		if(head==null)
		{
			head=addNew;
			
			return;
		}
		addNew.next=null;
		Node n=head;
		
		while(n.next!=null)
		{
			//System.out.println(n.data + " ");
			n=n.next;
			
		}
		n.next=addNew;
		//System.out.println(n.data + " ");
		addNew.next=null;
		
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data + " ");
			temp=temp.next;
		}
	}

}

class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}