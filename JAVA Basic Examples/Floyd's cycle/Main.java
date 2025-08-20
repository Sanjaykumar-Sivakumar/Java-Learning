class Node{
   int data;
   Node next;
   Node(int d)
   {
      data = d;
      next = null;
   }
}
public class Main
{
   Node head;
   Node current;
   void list(int a)
   {
      Node newNode = new Node(a);
      newNode.next=head;
      head=newNode;
   }
   void floyds_cycle()
   {
      Node fast = head;
      Node slow = head;
      while(fast!=null && fast.next!=null)
      {
         slow = slow.next;
         fast = fast.next.next;
      
      if(slow == fast)
      {
         System.out.println("loop found");
         return;
      }
     
   }
    System.out.println("loop not found");}
	public static void main(String[] args) 
	{
	   Main ob = new Main();
	   int n = 5;
	   ob.list(1);
	   ob.list(2);
	   ob.list(3);
	   ob.list(4);
	   ob.list(5);
	   ob.head.next.next.next.next=ob.head;
	   ob.floyds_cycle();
	}
}