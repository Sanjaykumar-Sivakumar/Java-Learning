import java.util.*;
class Student
{
    private int id ;
    private String n ;
    private String dep ;
    
    //setter
    public void setVal(int ID,String N,String Dep)
    {
        id=ID;
        n=N;
        dep=Dep;
    }
    
    //getter
    int getid()
    {
        return id;
    }
    String getn()
    {
        return n;
    }
    String getdep()
    {
        return dep;
    }
    
}
class Main 
{
    public static void main(String[]args)
    {
        Student x=new Student();
        x.setVal(1234,"sanjay","ece");
        System.out.println("id: "+x.getid());
        System.out.println("name: "+x.getn());
        System.out.println("department: "+x.getdep());
    }
}