// Take number of kilmeters , convert it to centimeters, then print it on the screen 2 200000

import java.util.Scanner;
class KmToCm{
public static void main(String[] args){

    Scanner sc=new Scanner (System.in);
    System.out.println("Enter number in Kilometers: ");

    int x=sc.nextInt();
    int y=100000*x;
    System.out.println("your Answer is: "+y);

}
}