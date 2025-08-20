import java.util.*;
class Main{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int sum = 0;
    int steps_count = 0;
    while (a!=1)
    {
        if(a%2==0)
        sum = a/2;
        else
        sum = a*3 + 1;
        a=sum;
        steps_count++;
        
    }
    System.out.println(steps_count);
}
}