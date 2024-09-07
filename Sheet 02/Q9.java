// Write a program to check whether a number is negative, positive or zero.

import java.util.Scanner;
class CheckNum{
    public static void main(String[] args){
        System.out.print("Enter number: ");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if (num>0){
            System.out.println("Number is Positive");
        }
        else if (num<0){
            System.out.println("Number is Negative");

        }
        else {
            System.out.println("Number is Zero");
        }


    }
}