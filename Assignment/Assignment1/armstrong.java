import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no ");
        int n=sc.nextInt();
        int sum=0;
        int original=n;
        while(n!=0){
            int digit=n%10;
            int i=digit*digit*digit;
            sum=sum+i;
            n=n/10;
        }
        if(original==sum){
            System.out.println("amstrong");
        }else{
            System.out.println("not amstrong");
        }
    }
}
