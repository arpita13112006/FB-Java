import java.util.Scanner;

public class strongnum {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   // input
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact *= i;   // factorial of digit
            }

            sum += fact;
            num /= 10;
        }

        if (sum == original)
            System.out.println("Strong");
        else
            System.out.println("Not Strong");
    }

}
