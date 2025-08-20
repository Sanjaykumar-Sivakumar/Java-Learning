import java.util.*;
class Node
{
	int data;
	Node next;
	Node prev;
	Node(int n)
	{
		data=n;
		next=null;
	}
}
class Main
{
	Node head;
	Node current;
	void list(int a)
	{
		Node newnode=new Node(a);
		if(head==null)
		{
			head=newnode;
			current=newnode;
		}
		else
		{
			current.next=newnode;
			newnode.prev = current;
			current=newnode;
		}
	}
	void print()
	{

		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
	public static void main(String[]args)
	{
	   Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Main m = new Main();
		for(int i = 0;i<n;i++)
		{
		   int val = sc.nextInt();
		   m.list(val);
		}
		m.print();
		//System.out.println();
		//m.duplicate();
	//	m.print();
	}
}