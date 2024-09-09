// Write a program to count number of digits in any number.
import java.util.Scanner;
class NumOfDigit{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int count =0,k=0;
        System.out.print("Enter Number: ");
        int num= sc.nextInt();
         k=num;
        while (num>0){
            num/=10;
            count++;
        }
        System.out.println("Number of Digits in "+k+" is: "+count);
    }
}
