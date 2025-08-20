import java.util.*;
class sa{
   String name;
   String Acc_no;
   double Bank_Bal;
   
   
   sa()
   {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = sc.nextLine();
        System.out.print("Enter your Account Number: ");
        Acc_no = sc.nextLine();
        System.out.print("Enter your Bank Balance: ");
        Bank_Bal = sc.nextDouble();
   }
   void credit(double amount)
   {
         Bank_Bal+=amount;
         System.out.print("Amount Credited Successfully!!");
         System.out.println(" New Balance: "+Bank_Bal);
   
   }
   void debit(double amount)
   {
         Bank_Bal-=amount;
         System.out.print("Amount has been Debited!!");
         System.out.println("Current Balance: "+Bank_Bal);
   }
}
class Main{
   public static void main (String[] args) 
   {
      Scanner sc = new Scanner(System.in);
      sa d = new sa();
      System.out.print("Insert the Amount to credit: ");
      double cA = sc.nextDouble();
      d.credit(cA); 
      System.out.print("Enter the Amount to debit: ");
      double dA = sc.nextDouble();
      d.debit(dA);
      System.out.println("Account Details: ");
      System.out.print("Account Holder's Name: ");
      System.out.println(d.name);
      System.out.print("Account No: ");
      System.out.println(d.Acc_no);
      System.out.print("Amount Balance: ");
      System.out.println(d.Bank_Bal);
      
    
      
   }
}