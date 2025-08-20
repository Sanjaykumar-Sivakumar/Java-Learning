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
		prev = null;
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
  public	void insert(int pos,int d)
	{
	   Node current = head;
	   Node n = new Node(d);
	  for(int i = 1;i<pos - 1;i++)
	  {
	     current = current.next;
	  }
	  n.next = current.next;
	  n.prev = current;
	  current.next = n;
	  n.next.prev = n;
	}
	public static void main(String[]args)
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the size: ");
		int n=sc.nextInt();
		Main m = new Main();
		System.out.println("Enter the Elements: ");
		for(int i = 0;i<n;i++)
		{
		   int val = sc.nextInt();
		   m.list(val);
		}
		System.out.println("Given List: ");
		m.print();
		System.out.println();
		System.out.print("Enter the Position: ");
		int a = sc.nextInt();
		System.out.print("Enter the element which u need to insert: ");
		int b = sc.nextInt();
		System.out.println("List After Insertion: ");
		m.insert(a,b);
	   m.print();
	}
}