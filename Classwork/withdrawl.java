package Classwork;

import java.util.Scanner;
class withdra {
    double balance;

    // Constructor to initialize balance
    withdra(double balance) {
        this.balance = balance;
    }

    // Overloaded deposit method 1: No parameter
    void deposit() {
        System.out.println("No deposit amount entered.");
        System.out.println("Current balance: " + balance);
    }

    // Overloaded deposit method 2: With amount parameter
    void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Updated balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Amount: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
        System.out.println("Current balance after withdrawal: " + balance);
    }
}
public class withdrawl {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double bal = sc.nextDouble();

        withdrawl user = new withdrawl(bal);

        System.out.print("Enter deposit amount: ");
        double dep = sc.nextDouble();
        user.deposit(dep);

        System.out.print("Enter withdrawal amount: ");
        double wd = sc.nextDouble();
        user.withdra(wd);
    }
}

// create a method price overloaded selling price and discount , selling price - 40 percent discount ,selling price ,discount , exchange bonus
