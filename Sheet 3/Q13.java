// 13 Write a program to swap first and last digits of any number. 6482 2486


import java.util.Scanner;
class SwapFirstLast{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num= sc.nextInt();
        if(num<0){
          num=-num;
        }
        int first=num;
        int last= num;

      while(first>10){
        first=first/10;

      }
        last=num%10;


            
    }
}