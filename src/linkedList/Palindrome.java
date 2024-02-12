package linkedList;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head=new ListNode(1);
		ListNode n1=new ListNode(0);
		ListNode n2=new ListNode(0);
		//ListNode n3=new ListNode(1);
		head.next=n1;
		n1.next=n2;
		//n2.next=n3;
		boolean checkPalindrome=isPalindrome(head);
		System.out.println(checkPalindrome);

	}
	
	 public static boolean isPalindrome(ListNode head) {
		 ListNode slow=head;
	        ListNode fast=head;
	        // find the middle node of the list
	        while(fast.next!=null && fast.next.next!=null){
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        // reverse the second half of the list
	        slow.next=reverseList(slow.next);
	        //update the 'slow' pointer
	        slow=slow.next;
	        //iterate both the lists simultaneously
	        while(slow!=null){
	            if(head.val!=slow.val)
	            return false;
	            head=head.next;
	            slow=slow.next;
	        }
	        return true;
	        
	    }
	    public static ListNode reverseList(ListNode head)
	    {
	        ListNode prev=null;
	        ListNode curr=head;
	        ListNode next=null;
	        while(curr!=null)
	        {
	            next=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=next;
	        }
	        return prev;
	    }

}

class ListNode {
	    int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

