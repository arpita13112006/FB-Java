import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int count=0;

    System.out.print("enter a number: ");
    int N = sc.nextInt();

    while(N!=0){
        N=N/10;
        count++;
    }
    System.out.println(count);

    }
}
