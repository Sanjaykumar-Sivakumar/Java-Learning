import java.util.*;
class employee{
   String id;
   String Name;
   String Address;
   String Ph_no;
   employee(String id,String Name,String Address,String Ph_no)
   {
      this.id = id;
      this.Name = Name;
      this.Address = Address;
      this.Ph_no = Ph_no;
   }
      void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + Name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Ph_no);
      }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the ID: ");
		String a = sc.next();
	   System.out.print("Enter the Name: ");
		String b = sc.next();
		System.out.print("Enter the Address: ");
		String c = sc.next();
		System.out.print("Enter Your Contact Number: ");
		String d = sc.next();
		employee ob = new employee(a,b,c,d);
	   ob.display();
		
	}
}