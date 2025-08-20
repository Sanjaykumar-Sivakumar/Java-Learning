import java.util.*;
class Minstack
{
   Stack<Integer>stack;
   Stack<Integer>minstack;
   Minstack()
   {
      stack = new Stack<>();
      minstack = new Stack<>();
   }
void push(int d)
{
   stack.push(d);
   if(minstack.isEmpty() || d<=minstack.peek())
   {
      minstack.push(d);
   }
}
void pop()
{
   if(!stack.isEmpty())
   {
      if(stack.peek().equals(minstack.peek()))
      {
         minstack.pop();
      }
      stack.pop();
   }
}
int top()
{
   return stack.peek();
}
int getMin()
{
   return minstack.peek();
}
}
class Main
{
	public static void main(String[] args) {
		Minstack m = new Minstack();
		m.push(7);
		m.push(6);
		m.push(5);
		m.push(4);
		m.push(3);
		m.push(2);
		m.push(1);
		m.pop();
		m.top();
		m.getMin();
		m.push(-1);
		m.getMin();
		System.out.println("Top value: "+ m.top());
		System.out.println("Minimum value: " +m.getMin());
	}
}