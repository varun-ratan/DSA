package linkedList;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head=new Node(10);
		Node n1=new Node(20);
		Node n2=new Node(30);
		head.next=n1;
		n1.next=n2;
		Node head1=new Node(5);
		Node n3=new Node(25);
		head1.next=n3;
		
		Node newHead=mergeTwoList(head,head1);
		traverse(newHead);
	}
	public static Node mergeTwoList(Node head,Node head1)
	{
		Node temp=null;
		Node temp1=null;
		if(head.data<=head1.data)
		{
			temp=temp1=head;
			head=head.next;
		}
		else
		{
			temp=temp1=head1;
			head1=head1.next;	
		}
		while(head!=null && head1!=null)
		{
			if(head.data<=head1.data)
			{
				temp.next=head;
				temp=head;
				head=head.next;
				
			}
			else
			{
				temp.next=head1;
				temp=head1;
				head1=head1.next;
				
			}
			if(head==null)
			{
				temp.next=head1;
			}
			else
				temp.next=head;
			
		}
		return temp1;
	}

	public static void traverse(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+" ");
			head=head.next;
		}
	}
}
