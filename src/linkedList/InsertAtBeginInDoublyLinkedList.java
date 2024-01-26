package linkedList;

public class InsertAtBeginInDoublyLinkedList {
	public static DoublyNode insert(DoublyNode head, int data)
	{
		DoublyNode temp=new DoublyNode(data);
		if(head==null)
		{
			head=temp;
		}
		head.prev=temp;
		temp.next=head;
		head=temp;
		return head;
		

		
	}

}
