import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number of terms: ");
        int N = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + N + " terms: ");

        for (int i = 1; i <= N; i++) {
            System.out.print(first + " ");   
            int next = first + second;      
            first = second;                  
            second = next;
        }
    }
}

