// 10 Write a program to check whether a number is divisible by 5 and 11 or not.
import java.util.Scanner;
class CheckDivisiblity{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        if(CheckDivisiblity(num)){

        System.out.println(num+" is Divisible.");
        }
        else 
        {
        System.out.println(num+" is not Divisible.");

        }


    }
    public static boolean CheckDivisiblity(int x){
        return( (x%5==0) || (x%11==0)  );
        
    }
}