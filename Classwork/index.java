package Classwork;

class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }
}
public class index {
    public static void main(String[] args) {
        Calculator calc=new  Calculator();
        System.out.println("sum of two integer: "+calc.add(5,10));
        System.out.println("sum of three integer: "+calc.add(5,10,12));
        System.out.println("sum of two doubles: "+calc.add(8,10.903));
    }
}
//create a method deposit in a class name bank overload dismethod take user balance and withdrawal , show current balance after widtharwal , 
