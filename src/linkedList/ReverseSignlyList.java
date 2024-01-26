package linkedList;

public class ReverseSignlyList {
	public static Node reverse(Node head)
	{
		if(head==null)
			return null;
		Node cur=head;
		Node prev=null;
		Node next=null;
		while(cur!=null)
		{
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}

}
