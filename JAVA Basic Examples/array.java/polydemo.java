interface college
{
int nop=1;
void student();
}
interface staff
{
void office();
void dept();
}
class student
{
int nos;
student(int n)
{
nos=n;
}
}
class poly extends student implements college,staff
{
int nod,nts,nnts,nhod,nol,noc;
poly(int n,int nd,int nt,int nnt,int hod,int lb,int cr)
{
super(n);
nod=nd;
nts=nt;
nnts=nnt;
nhod=hod;
nol=lb;
noc=cr;
}
public void student()
{
System.out.println("Student details");
System.out.println("The no.of students are "+nos);
}
public void office()
{
System.out.println("Office details");
System.out.println("The no.of non-teaching staff are "+nnts);
}
public void dept()
{
System.out.println("Department details");
System.out.println("The no.of departments are "+nod);
System.out.println("The no.of principals are "+nop);
System.out.println("The no.of staff are "+nts);
System.out.println("The no.of hod are "+nhod);
System.out.println("The no.of libraries are "+nol);
System.out.println("The no.of classrooms are "+noc);
}
}
class polydemo
{
public static void main(String arg[])
{
poly p=new poly(1500,10,50,30,10,2,30);
p.student();
p.office();
p.dept();
}
}