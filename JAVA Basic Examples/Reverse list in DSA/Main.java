import java.util.*;
class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
class Main
{
	Node head;

	void print()
	{
		Node current = head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		Main ob = new Main();
		for(int i = 0; i<d; i++)
		{
			int n = sc.nextInt();
			Node newnode = new Node(n);
			if(ob.head == null)
			{
				ob.head= newnode;
			}
			else
			{
				newnode.next = ob.head;
				ob.head = newnode;
			}
		}
		ob.print();
	}
}