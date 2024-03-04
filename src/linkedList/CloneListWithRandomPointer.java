package linkedList;

import java.util.HashMap;

public class CloneListWithRandomPointer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeWithRandom n1=new NodeWithRandom(1);
		NodeWithRandom n2=new NodeWithRandom(2);
		NodeWithRandom n3=new NodeWithRandom(3);
		NodeWithRandom n4=new NodeWithRandom(4);
		NodeWithRandom n5=new NodeWithRandom(5);
		NodeWithRandom head=n1;
		n1.next=n2;
		n1.random=n3;
		n2.next=n3;
		n2.random=n1;
		n3.next=n4;
		n3.random=n5;
		n4.next=n5;
		n5.next=null;
		n5.random=n2;
		NodeWithRandom res=clone(head);
		traverse(res);
	}
	public static NodeWithRandom clone(NodeWithRandom head)
	{
		HashMap<NodeWithRandom,NodeWithRandom> h=new HashMap<>();
		for(NodeWithRandom cur=head;cur!=null;cur=cur.next)
		{
			h.put(cur, new NodeWithRandom(cur.data));
		}
		for(NodeWithRandom cur=head;cur!=null;cur=cur.next)
		{
			NodeWithRandom clone=h.get(cur);
			clone.next=h.get(cur.next);
			clone.random=h.get(cur.random);
		}
		
		return h.get(head);
	}
	
	public static void traverse(NodeWithRandom head)
	{
		for(NodeWithRandom cur=head;cur!=null;cur=cur.next)
		{
			if(cur.random==null || cur.next==null)
			{
				System.out.println("Data "+cur.data+" next "+null+" random "+ null);
			}
			else
				System.out.println("Data "+cur.data+" next "+cur.next.data+" random "+cur.random.data);
		}
	}
}
