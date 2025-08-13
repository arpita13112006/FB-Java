import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Example prints
        // System.out.println("Arpita Patra");
        // System.out.println("Age: 18");
        // System.out.println("University roll no: 2415000330");
        // System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        Scanner sc = new Scanner(System.in); // Correct way to create Scanner

        // Take inputs
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Print sum
      System.out.println("Sum: " + (a + b));
      System.out.println("diff: "+(a-b));
      System.out.println("multiply: " + (a*b));
      System.out.println("division: "+(a/b));

        sc.close(); // Close scanner
    }
}
