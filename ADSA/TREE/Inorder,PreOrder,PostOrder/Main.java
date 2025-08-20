import java.util.*;
public class Main
{
	class Node {
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	Node root;
	Scanner sc = new Scanner(System.in);
	Node Create()
	{
		System.out.print("Enter the Node data (-1) For Exit: ");
		int v = sc.nextInt();
		if(v == -1)
		{
			return null;
		}
		Node newNode = new Node(v);
		System.out.print("Enter the Left Node data For "+newNode.data);
		newNode.left = Create();
		System.out.print("Enter the Right Node data For "+newNode.data);
		newNode.right = Create();
		return newNode;
	}
	void Inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Inorder(root.left);
		System.out.println(root.data+" ");
		Inorder(root.right);
	}
	void Preorder(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.println(root.data+" ");
		Inorder(root.left);
		Inorder(root.right);
	}
	void Postorder(Node root)
	{
		if(root == null)
		{
			return;
		}

		Inorder(root.left);

		Inorder(root.right);
		System.out.println(root.data+" ");
	}
	public static void main(String[] args)
	{
		Main ob = new Main();
		ob.root = ob.Create();
		ob.Inorder(ob.root);
		ob.Preorder(ob.root);
		ob.Postorder(ob.root);

	}
}