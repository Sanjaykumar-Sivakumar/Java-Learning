import java.util.*;
class node 
{
    int data;
    node next;
    node(int d)
    {
        data=d;
        next=null;
    }
}
class Main 
{
    node top;node tail;
    void push(int a)
    {
        node list = new node(a);
        if(top==null)
        {
            top=list;
            tail=list;
        }
        else
        {
            list.next=top;
            top=list;
    }
    void top(int n)
    {
        node list=new node(n);
        list.next=top;
        top=list;
    }
    void prev(int n)
    {
        node list=new node(n);
        tail.next=list;
        tail=tail.next;
    }
    void print()
    {
        node c=top;
        while(c!=null)
        {
            System.out.print(c.data+" ");
            c=c.next;
        }
    }
    public static void main(String args[])
    {
        Main m = new Main();
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        m.print();
        m.top(34);System.out.println();
        m.print();
        m.prev(45);System.out.println();
        m.print();
    }
}