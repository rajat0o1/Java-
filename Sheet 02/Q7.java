// Write a program to create a basic calculator.
// Provide a menu with 4 options to the user and let the user choose one of the options[1-
// 4].
// After the user has chosen the option take 2 more numbers as input from the user.
// Perform the operation that user has chosen in first step.
// 1. Add
// 2. Subtract
// 3. Multiply
import java.util. Scanner;

class Calculator{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("choose one of the options[1-4]");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Exit");
        int choice = sc.nextInt();

        if (choice ==4){
            System.out.println("Exiting....");
        }

            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();
            double result;
            switch(choice){
                case 1 :
                    result = Add(num1, num2);
                    System.out.println("Result: "+ result);
                    break;

                case 2:
                    result = Subtract(num1, num2);
                    System.out.println("Result: "+ result);
                    break;
                case 3:
                    result = Multiply(num1, num2);
                    System.out.println("Result: "+ result);
                    break;
                case 4: 
                    result = Divide(num1, num2);
                    System.out.println("Result: "+ result);
                    break;
                    default: 
                    System.out.print("Invalid Choice");
            }
            


    }

    public static double Add(double num1, double num2){
        return num1 + num2;
    }
    public static double Subtract(double num1,double num2){
        return num1 - num2  ;
    }

    public static double Multiply(double num1, double num2){
        return num1 *  num2  ;
    }
     public static double Divide(double num1, double num2){
        return num1 / num2 ;
    }


}