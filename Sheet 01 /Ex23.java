//23 Write a program to enter Principal, Time, Rate, calculate & print Simple Interest

import java.util.Scanner;
class SI{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double principal,time,rate,SimpleInterest ;
        System.out.println("Enter Principal, Time and Rate: ");
        principal=sc.nextDouble();
        time=sc.nextDouble();
        rate=sc.nextDouble();
        SimpleInterest=principal * time * rate;
        System.out.println("Simple Interest is: "+ SimpleInterest);



    }
}