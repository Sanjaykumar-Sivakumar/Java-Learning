import java.util.*;
class A
{
   void grandfather()
   {
      System.out.println("Wake up");
   }
}
class B extends A{
   void father()
   {
      System.out.println("Yes Daddy!!");
   }
}
class C extends B{
   void son()
   {
      System.out.println("Ok Granpa!!");
   }
}
class Main
{
	public static void main(String[] args) {
	B ob = new B();
	C ob1 = new C();
	ob.grandfather();
	ob.father();
	ob1.son();
	}
}