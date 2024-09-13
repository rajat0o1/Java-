// 11 Write a program to find first and last digit of any number.                   6482 6, 2,


import java.util.Scanner;
class FirstLast{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Positive Number: ");
        int x= sc.nextInt();
        int lastNum= x;
        int firstNum= x;

        while(firstNum>10){
            
            firstNum/=10;
        }
        
        lastNum=lastNum%10;
        System.out.println(x);
        System.out.println(firstNum);
        System.out.println(lastNum);





    }
}