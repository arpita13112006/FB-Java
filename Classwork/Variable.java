package Classwork;

public class Variable {
     static int a = 2; //static variable
    public static void main(String[] args) {
        int b = 10; //local variable


        System.out.println(b);    //calling a static variable


        System.out.println(Variable.a);  //calling a local variable
    }
}
