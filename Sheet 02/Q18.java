// Write a program to input angles of a triangle and check whether triangle is valid or not.
import java.util.Scanner;
class ValidTriangleCheck{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Angle 1 (angle>0) of the Triangle to check it is valid or not: ");
        double angle1=sc.nextDouble();
        System.out.print("Enter Angle 2 (angle>0) of the Triangle to check it is valid or not: ");
        double angle2=sc.nextDouble();

        System.out.print("Enter Angle 3 (angle>0) of the Triangle to check it is valid or not: ");
        double angle3=sc.nextDouble();
        
        if (angle1 + angle2 + angle3 == 180){
            System.out.println("It is Valid Triangle");
        }
        else {
            System.out.println("It is not Valid Triangle");
        }


    }

}