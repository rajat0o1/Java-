// 4 Take a number as an input, print if the number is odd or even 

import java.util.Scanner;
class OddEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int x=sc.nextInt();
        if(x%2==0){
            System.out.println("Lets get Even");
        }
        else {
        System.out.println("Odd one out");
        }

    }
}