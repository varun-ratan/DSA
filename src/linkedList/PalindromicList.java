package linkedList;

public class PalindromicList {

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
		boolean res=checkPalindrome(head);
		System.out.println("The given list is not Palindrome "+ res);

	}
	public static boolean checkPalindrome(Node head)
	{
		if(head==null)
		{
			return true;
		}
		Node i=head;
		Node j=head;
		while(i!=null && j.next!=null)
		{
			i=i.next;
			j=j.next.next;
		}
		Node newHead=reverse(i);
		Node n=head;
		Node n2=newHead;
		int flag=0;
		while(n!=null && n2!=null)
		{
			if(n.data!=n2.data)
			{
				flag=1;
				break;
			}
			n=n.next;
			n2=n2.next;
		}
		if(flag==0)
		{
			return true;
		}
		
		return false;
	}
	public static Node reverse(Node newHead)
	{
		Node cur=newHead;
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
