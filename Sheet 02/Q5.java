// 5 Take the year as an input, print on the screen if it is a Leap year
 
 import java.util.Scanner;
 class LeapOrNot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int y=sc.nextInt();
        if((y%4==0) && (y%400==0) ){
            System.out.println("Yay!!! One extra day to live your life. its a LEAP YEAR");
        }
        else {
            System.out.println("Get paid for the whole month while working for 28 days only :-) not a leap year");
        }

    }
 }