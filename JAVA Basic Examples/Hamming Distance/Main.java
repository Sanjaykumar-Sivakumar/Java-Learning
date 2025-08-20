import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two numbers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // XOR to find differing bits
        int xor = num1 ^ num2;

        // Count set bits in the XOR result
        int hammingDistance = Integer.bitCount(xor);

        // Output the result
        System.out.println("Hamming Distance: " + hammingDistance);
    }
}
