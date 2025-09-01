import java.util.*;
public class Main
{
   static class Node
   {
      int data;
      List<Node>CDR;
      Node(int d)
      {
         this.data = d;
         this.CDR = new ArrayList<>();
      }
      void addchild(Node CD)
      {
         this.CDR.add(CD);
      }
   }
      public static void main (String[] args) 
      {
       Node root = new Node(1);
       Node CD2 = new Node(2);
       Node CD3 = new Node(3);
       Node CD4 = new Node(4);
       root.addchild(CD2);
       root.addchild(CD3);
       root.addchild(CD4);
       
       Node CD5 = new Node(5);
       Node CD6 = new Node(6);
       CD2.addchild(CD5);
       CD2.addchild(CD6);
       
       Node CD7 = new Node(7);
       CD3.addchild(CD7);
       
       Node CD8 = new Node(8);
       Node CD9 = new Node(9);
       CD4.addchild(CD8);
       CD4.addchild(CD9);
       System.out.println("N- ARY Tree is Created Successfully!!");
       System.out.println("Root data: "+ root.data);
       System.out.println("Children of root: ");
       for(Node CD : root.CDR)
       {
          System.out.println(CD.data+" ");
       }
       System.out.println("Children of Node2: ");
       for(Node CD : CD2.CDR)
       {
          System.out.println(CD.data+" ");
       }
        System.out.println("Children of Node3: ");
       for(Node CD : CD3.CDR)
       {
          System.out.println(CD.data+" ");
       }
        System.out.println("Children of Node4: ");
       for(Node CD : CD4.CDR)
       {
          System.out.println(CD.data+" ");
       }
      }
   }
