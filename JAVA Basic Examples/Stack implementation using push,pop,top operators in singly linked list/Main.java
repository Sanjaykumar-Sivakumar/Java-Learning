import java.util.*;
class Node{
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
   Node top;
   Node temp;
   void push(int a)
   {
      Node n = new Node(a);
   if(top == null)
   {
      top = n;
   }
   else
   {
      n.next = top;
      top = n;
   }
   }
   void pop()
   {
   if(top == null)
   {
      System.out.println("Stack is Empty!!");
   }
   else
   {
      Node temp =top;
      top = top.next;
      temp.next = null;
      
   }
   }
   void top()
   {
   if(top == null)
   {
      System.out.println("Stack is Empty!!");
   }
   else
   {
     System.out.println("Top Data: " +top.data);
   }
   }
   void print()
   {
      Node temp = top;
      while(temp!=null)
      {
         System.out.print(temp.data+" ");
         temp =temp.next;
      }
   }
	public static void main(String[] args) {
		Main ob = new Main();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.push(5);
		ob.pop();
		ob.top();
		ob.push(-1);
		System.out.print("Result: ");
		ob.print();
	}
}