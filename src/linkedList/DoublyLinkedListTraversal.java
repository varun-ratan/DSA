package linkedList;

public class DoublyLinkedListTraversal {

	public static void traverse(DoublyNode head)
	{
	DoublyNode temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	}
}
