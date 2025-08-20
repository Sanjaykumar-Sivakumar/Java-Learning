import java.util.*;
class A
{
   void grandfather()
   {
      System.out.println("Wake up");
   }
}
class B extends A{
   void grandfather()
   {
      super.grandfather();
      System.out.println("Yes Daddy!!");
   }
}
class C extends B{
   void grandfather()
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
	//ob.grandfather();
	ob1.grandfather();
	}
}