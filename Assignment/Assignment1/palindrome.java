import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in);

    System.out.print("enter a number: ");
    int N = sc.nextInt();

    int original=N;
    int reverse=0;

    while(N!=0){
        int lastdigit=N%10;
        reverse=reverse*10+lastdigit;
        N=N/10;
    }
    if(original==reverse){
        System.out.println("Palindrome");
    }else{
        System.out.println("Not Palindrome");
    }


    }
}
