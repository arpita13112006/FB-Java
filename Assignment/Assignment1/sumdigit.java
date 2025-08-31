import java.util.Scanner;
public class sumdigit {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int sum=0;

    System.out.print("enter a number: ");
    int N = sc.nextInt();

    while(N!=0){
        int lastdigit=N%10;
        sum=sum+lastdigit;
        N=N/10;
    }
    System.out.println(sum);
}
}
