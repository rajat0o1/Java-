// 1 Take 2 numbers as input from user, print the largest number on the screen


import java.util.Scanner;
class LargestOfTwo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int one =sc.nextInt();
        int two=sc.nextInt();
        if (one > two){
            System.out.println(one);
        }
        System.out.println(two);



    }
}