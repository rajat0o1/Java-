// Take number of inches , convert it to feet, then print it on the screen

import java.util.Scanner;
class InchesToFeet{
    public static void main(String[] args){
        int x=0;
        System.out.print("Enter number in Inches: ");
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        int y=x*12;
        System.out.println("Your answer is: "+y);

    }
}