// Write a program to find sum of first and last digit of any number.
import java.util.Scanner;
class SumOfFirstLast{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();

        if (num<0){
            num=-num;
        }
        
        int first=num,sum=0,last=num;
        while(first>10){
        first= num/10;
        }
    last= num%10;
    sum = first + last;
    System.out.println(sum);
    }

}