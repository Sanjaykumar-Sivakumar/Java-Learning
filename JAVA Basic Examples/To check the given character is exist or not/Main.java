import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();    
        String b = sc.nextLine();    
        int ls1 = a.length();
        int ls2 = b.length();
        boolean found = false;
        int j =0;
        for(int i = 0;i<ls1;i++)
        {
            char ch1 = a.charAt(i);
            
            for( j =0;j<ls2;j++){
                char ch2 = b.charAt(j);
                if(a.charAt(i+j) != ch2){
                    break;
                }
            }
            
            
            if(j == ls2){
                found = true;
                break;
            }
            
            
        
        }
        System.out.println(found);
	}
}
