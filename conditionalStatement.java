// write a program to check if a number is positive

import java.util.Scanner;

public class conditionalStatement{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter any number:");
         int x = input.nextInt();

        if( x >0){
            System.out.println("given number is positive");
        }else{
            System.out.println("given number is not positive");
        }
        input.close();

        
    }
}