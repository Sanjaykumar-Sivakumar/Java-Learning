import java.util.*;
class Main
{
public static void main(String arg[])throws Exception
{
int a[],i,n;
a=new int[5];
Scanner Ssk=new Scanner(System.in);
System.out.println("Enter the no.of.elements:");
n=Ssk.nextInt();
System.out.println("Enter the array value:");
for(i=0;i<=n;i++)
{
a[i]=Ssk.nextInt();
}
for(i=0;i<=n;i++)
{
System.out.println(+a[i]);
}
}
}