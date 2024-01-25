package linkedList;

public class CloneAList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(20);
		Node n5=new Node(10);
		Node head=n1;
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		clone(head);
	}
	public static void clone(Node head)
	{
		Node temp=head;
		Node newHead=null;
		while(temp!=null)
		{
			insert(newHead,temp.data);
			temp=temp.next;
			
		}
		
		Node n1=newHead;
		while(n1!=null)
		{
			System.out.println(n1.data);
			n1=n1.next;
		}
	}
	public static void insert(Node head,int data)
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
			System.out.println(n.data + " ");
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
