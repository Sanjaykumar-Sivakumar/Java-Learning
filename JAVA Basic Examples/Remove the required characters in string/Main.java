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
        String res = "";
        for(int i =0;i<ls1;i++){
            char ch1 = a.charAt(i);
            found = false;
            for(int j =0;j<ls2;j++){
                char ch2 = b.charAt(j);
                if(ch2==ch1){
                    found = true;
                }
            }
            if(!found){
                res+=ch1;
            }
             
        }
		System.out.println(res);
	}
}
