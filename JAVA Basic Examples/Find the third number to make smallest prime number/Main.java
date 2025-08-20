import java.util.*;
public class Main
{
    static boolean isPrime(int n){
        if(n==1) return false;
        for(int i = 2;i<n;i++){
            if((n%i)==0) return false;
        }
        
        return true;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = 0;
		while(true){
		    int num = n1+n2+n3;
		    if(isPrime(num)){
		        System.out.println(n3);
		        break;
		    }else{
		        n3++;
		    }
		}
        
	}
}
