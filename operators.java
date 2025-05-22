// write a program taht takes 2 numbers and shws sum, difference, product,quotient,remainder

import java.util.Scanner;
public class operators{
    public static void main( String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        int sum = a + b;
        int difference = a - b ;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b ;

        System.out.println("sum:" + sum);
        System.out.println("difference:" + difference);
        System.out.println("product:" + product);
        System.out.println("quotient:" + quotient);
        System.out.println("remainder:" + remainder);

       

    }
}