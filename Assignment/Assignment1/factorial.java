import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int fact=1;

    System.out.print("enter a number: ");
    int N = sc.nextInt();

    for(int i=1;i<=N;i++){
        fact=fact*i;
    }
    System.out.println(fact);


    }
}
