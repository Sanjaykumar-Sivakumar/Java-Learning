import java.util.*;

class Main {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        Set<Integer> s1 = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter arr1 size: ");
        int a = sc.nextInt();
        Integer[] arr = new Integer[a];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter arr2 size: ");
        int b = sc.nextInt();
        Integer[] arr1 = new Integer[b];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < b; i++) {
            arr1[i] = sc.nextInt();
        }

        s.addAll(Arrays.asList(arr));   
        s1.addAll(Arrays.asList(arr1));

        s.containsAll(s1);
        if (s.containsAll(s1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
