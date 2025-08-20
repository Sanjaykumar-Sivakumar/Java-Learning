import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0;i<n;i++)
        {
            list.add(sc.nextInt());
        }

        System.out.println("Before: " + list);

        int zeroCount = 0;

        // Move non-zero elements forward and count zeros
        for (int i = 0; i < list.size(); ) {
            if (list.get(i) == 0) {
                list.remove(i);
                zeroCount++;
            } else {
                i++;
            }
        }

        // Add zeros at the end
        for (int i = 0; i < zeroCount; i++) {
            list.add(0);
        }

        System.out.println("After: " + list);
    }
}
