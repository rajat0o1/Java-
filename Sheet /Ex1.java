// calculate sum, difference, product, division and remainder of two numbers, and print the result on the
// screen
import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Numbers: ");
        int num1=sc.nextInt();
        int num2= sc.nextInt();
        double sum =num1+num2;
        System.out.println("Sum is: "+sum);

        double diff=num1-num2;
        System.out.println("Difference is:"+diff);

        double prod=num1*num2;
        System.out.println("Product is: "+prod);


        double div=num1/num2;
        System.out.println("Division is: "+div);

        double remainder= num1%num2;
        System.out.println("Remainder is: "+remainder);


    




        


    }
}