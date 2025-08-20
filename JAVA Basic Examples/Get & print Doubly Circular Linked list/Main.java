import java.util.*;
class Node{
   int data;
   Node next;
   Node prev;
   Node(int d)
   {
      data = d;
      next = null;
      prev = null;
   }
}
class Main
{
   Node head = null;
   Node tail = null;
   void list(int a)
   {
      Node n = new Node(a);
   if(head == null)
   {
      head = n;
      tail = n;
      tail.next = head;
      head.prev = tail;
   }
   else
   {
      tail.next = n;
      tail = n;
      tail.next = head;
      head.prev = tail;
   }
   }
   void print()
   {
      Node tail = head;
     do
      {
         System.out.print(tail.data+" ");
         tail = tail.next;
      }
       while(tail!=head);
   }
	public static void main(String[] args) {
		Main ob = new Main();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0;i<num;i++)
		{
		   int val = sc.nextInt();
		   ob.list(val);
		}
		ob.print();
	}
}