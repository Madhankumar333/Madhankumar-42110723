package recurtion;
import java.util.Scanner;

class binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        int decimalNumber = scanner.nextInt();

        // Convert to binary using recursion
        String binaryRepresentation = decimalToBinary(decimalNumber);

        // Print the binary representation
        System.out.println(binaryRepresentation);
    }

    // Recursive function to convert decimal to binary
    static String decimalToBinary(int n) {
        if (n == 0) { // Base case: if number is 0, return an empty string
            return "";
        }
        // Recursive case: divide by 2 and append the remainder
        return decimalToBinary(n / 2) + (n % 2);
    }
}