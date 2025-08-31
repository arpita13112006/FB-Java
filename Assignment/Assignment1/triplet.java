import java.util.Scanner;

public class triplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();   // input limit

        System.out.println("Pythagorean Triplets up to " + limit + ":");

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                for (int c = b; c <= limit; c++) {
                    if (a * a + b * b == c * c) {
                        System.out.println(a + " " + b + " " + c);
                    }
                }
            }
        }
    }
}
