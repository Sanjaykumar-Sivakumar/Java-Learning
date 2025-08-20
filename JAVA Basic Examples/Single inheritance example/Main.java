import java.util.*;
class A
{
   void father()
   {
      System.out.println("Wake up");
   }
}
class B extends A{
  
   void son()
   {
       super.father();
      System.out.println("Yes Daddy!!");
   }
}
class Main
{
	public static void main(String[] args) {
	B ob = new B();
	ob.son();
	}
}