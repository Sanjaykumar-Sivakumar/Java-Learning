import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
	    System.out.print("Enter the length : ");
	    int n = ob.nextInt();
	    int arr[] = new int[n];
	    for(int i = 0;i<n;i++){
	        arr[i] = ob.nextInt();
	    }
	    
	    int k = n;
	    int sum=0;
	    
	    for(int i=0;i<k;i++){
	        int temp = arr[n-1];
	        for(int j=n-1;j>0;j--){
	            arr[j]=arr[j-1];
	        }
	        arr[0]=temp;
	        
	        int t=0;
	        for(int j=0;j<n;j++){
	             t+=arr[j]*j;
	        }
	        if(sum<t) sum=t;
	    }
	    
	    
	        System.out.print(sum);
	    
	}
}
