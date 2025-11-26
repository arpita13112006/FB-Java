class account{
    private double balance;
    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("deposite")
        }
        balance+=amount;
        System.out.println("deposited: "+amount);
    }
    public void withdraw(double amount) throws Exception{
        if(amount<=0){
            throw new IllegalArgumentException("withdrawal")
        }else if(amount>balance){
            throw new Exception("Insufficient balance");
        }else{
            balance-=amount;
            System.out.println("withdrawl"+amount);
        }
        public double GetBalance(){
            return balance;
        }
    }
}

public class bank{
    public static void main(String[] args) {
        
    }
}

wap to take marks as input from a user if the marks are less than 0 or greater than 100 throw a custom exception invalid marks exception otherwise display the grade.
