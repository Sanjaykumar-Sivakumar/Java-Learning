import java.util.*;
class Main
{
	class Node {
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			this.data = d;
			this.left = null;
			this.right = null;
		}
	}
	Node root;
	void createBN()
	{
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);
		root.right.left = new Node(7);
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(11);
		
		root.right.left.left = new Node(12);
		root.right.left.right = new Node(13);
		root.right.right.left = new Node(14);
		root.right.right.right = new Node(15);
		//root.left = left;
		//root.right = right;
	}
	void disp(Node node)
	{
		if(node == null)
		{
			return;
		}
		disp(node.left);
		System.out.print(node.data+" ");
		disp(node.right);
	}
	boolean is_Strict_Binary(Node node)
	{
		if(node == null)
		{
			return true;
		}
		if(node.left == null && node.right == null)
		{
			return true;
		}
		if(node.left != null && node.right != null)
		{
			return is_Strict_Binary(node.left) && is_Strict_Binary(node.right);
		}
		return false;
	}

	public static void main(String[] args) {
		Main bn = new Main();
		bn.createBN();
		System.out.println("Inorder Traversal: ");
		bn.disp(bn.root);
		System.out.println();
		if(bn.is_Strict_Binary(bn.root))
		{
			System.out.println("Given tree is a Strict Binary Tree");
		}
		else
		{
			System.out.println("It is not an Strict Binary Tree");
		}
	}

}

