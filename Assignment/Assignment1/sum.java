import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);
    int sum=0;

    System.out.print("enter a number: ");
    int N = sc.nextInt();

    for(int i=1;i<=N;i++){
        sum=sum+i;
    }
    System.out.println(sum);
}

}
