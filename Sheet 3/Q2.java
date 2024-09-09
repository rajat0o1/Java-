// Write a program to print all natural numbers in reverse (from n to 1).

import java.util.Scanner;
class NaturalNumRev{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Length: ");
        int n=sc.nextInt();
       for (int i = n; i >= 1; i--) {
            System.out.println(i);
       }


    }
}