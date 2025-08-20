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
   int arr[] = new int[7];
   int top = -1;
   void push(int a)
   {
      Node n = new Node(a);
   if(top == arr.length-1)
   {
      System.out.println("Stack is full");
   }
   else
   {
      top++;
      arr[top] = a;
   }
   }
   void pop()
   {
   if(top == -1)
   {
      System.out.println("Stack is Empty!!");
   }
   else
   {
      System.out.println("pop: "+arr[top]);
      top--;
   }
   }
   void peek()
   {
      System.out.println("Peek value: "+arr[top]);
   }
   void print()
   {
     for(int i =top;i>=0;i--)
     {
        System.out.println(arr[i]);
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
		ob.peek();
		ob.push(-1);
		System.out.print("Result: ");
		ob.print();
	}
}