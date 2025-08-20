import java.util.*;
 class Main
 {
     int a =10;
     int b =5;
     void add() // without parameter, without return
     {
         System.out.println(a+b);
     }
     void sub(int x,int y)// with parameter, without return
     {
         System.out.println(a-b);
     }
     int mul() // without parameter, with return
     {
         return a*b;
     }
     int div(int a,int b) // with parameter, with return
     {
         return a/b;
     }
     public static void main(String args[])
     {
         Main obj = new Main();
         obj.add();
         obj.sub(10,5);
         System.out.println(obj.mul());
         System.out.println(obj.div(10,5));
         
     }
 }


























