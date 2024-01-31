package linkedList;

public class ReverseDoublyList {

	public static DoublyNode reverseDoublyList(DoublyNode head)
	{
		DoublyNode prev=null;
		DoublyNode curr=head;
		DoublyNode next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			curr.prev=next;
			prev=curr;
			curr=next;
			
		}
		return prev;
	}
}
