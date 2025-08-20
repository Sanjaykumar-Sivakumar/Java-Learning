import java.util.*;
class Node
{
	int data;
	Node next;
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
	void duplicate()
	{
		Node current=head;
		while(current!=null)
		{
		   Node temp = current;
		   while(temp.next!= null)
		   {
			if(temp.next.data == current.data)
			{
				temp.next=temp.next.next;

			}
			else
				temp=temp.next;
		}
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
		System.out.println();
		m.duplicate();
		m.print();
	}
}