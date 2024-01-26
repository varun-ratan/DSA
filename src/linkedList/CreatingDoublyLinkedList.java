package linkedList;

public class CreatingDoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyNode head=new DoublyNode(10);
		DoublyNode n1=new DoublyNode(20);
		DoublyNode n2=new DoublyNode(30);
		head.next=n1;
		n1.prev=head;
		n1.next=n2;
		n2.prev=n1;
		InsertAtBeginInDoublyLinkedList temp=new InsertAtBeginInDoublyLinkedList();
		DoublyNode newHead=temp.insert(head,50);
		DoublyLinkedListTraversal t=new DoublyLinkedListTraversal();
		t.traverse(newHead);

	}

}
