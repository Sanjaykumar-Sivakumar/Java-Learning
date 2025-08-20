import java.util.*;
class Node {
	int data;
	Node next;

	Node(int d) {
		data = d;
		next = null;
	}
}
class Linked_list
{
   Node head;
   void print()
   {
      Node current = head;
      System.out.println("Linked_list: ");
      while(current!=null)
      {
         System.out.print(current.data+" ");
         current = current.next;
      }
   }
   int middle()
   {
      Node fast = head;
      Node slow = head;
      if(fast!= null && fast.next!= null)
      {
         fast = fast.next.next;
         slow = slow.next;
      }
      return slow.data;
   }
}
public class Main
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of elemnets: ");
		int n = sc.nextInt();
		Linked_list ob = new Linked_list();
		System.out.println("Enter the elements: ");
		for(int i = 0;i<n;i++)
		{
		   int val = sc.nextInt();
		   Node newNode = new Node(val);
		   if(ob.head == null)
		   {
		      ob.head = newNode;
		   }
		   else
		   {
		      Node current = ob.head;
		      while(current.next!=null)
		      {
		         current = current.next;
		      }
		      current.next = newNode;
		   }
		      
		   }
		   ob.print();
		   System.out.println();
		   System.out.println("Middle element: "+ ob.middle());
	}
}