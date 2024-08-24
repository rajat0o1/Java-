//Take a number a meters, convert it to centimeters, then print it on the screen
import java.util.Scanner;
class MetersToCentimeters{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=0;
        System.out.print("Enter numbers in Meters: ");
        x=sc.nextInt();
        int y=x*100;
        System.out.println("Your Number in Centimeters is: "+y);



    }
}