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
	Node tail;
	void list(int a)
	{
		Node newnode=new Node(a);
		if(head==null)
		{
			head=newnode;
			tail=newnode;
		}
		else
		{
			tail.next=newnode;
			newnode.prev = tail;
			tail=newnode;
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
	void reverse()
	{
	   Node current = tail;
	   while(current!=null)
	   {
	      System.out.print(current.data+" ");
         current = current.prev;
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
		System.out.println("Normal list: ");
		m.print();
		System.out.println();
		System.out.println("Revresed list: ");
		m.reverse();
	}
}