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
		root = new Node(5);
		Node left = new Node(3);
		Node right = new Node(4);
		root.left = left;
		root.right = right;
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

	public static void main(String[] args) {
		Main bn = new Main();
		bn.createBN();
		System.out.println("Inorder Traversal: ");
		bn.disp(bn.root);
	}
}
