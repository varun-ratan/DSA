package trees;

public class BinaryTree {
	static Node root=null;
	public static void main(String []args)
	{
		
		BinaryTree tree=new BinaryTree();
		tree.root=new Node(10);
		tree.insert(root,2);
		tree.insert(root,20);
		tree.insert(root,1);
		tree.insert(root,5);
		tree.traverseInOrder(root);
		
	}

	public static void insert(Node node, int data )
	{
		if(data < node.data)
		{
			if(node.left!=null)
			{
				insert(node.left,data);
			}
			else
			{
				node.left=new Node(data);
			}
		}
		else if(data>node.data)
			{
			if(node.right!=null)
			{
				insert(node.right,data);
			}
			else
			{
				node.right=new Node(data);
			}
		 }
			
		}
	
	public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
     }
}



class Node{
	int data;
	Node left,right;
	
	Node(int data)
	{
		this.data=data;
		left=right=null;
	}
}