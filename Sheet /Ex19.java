// Write a program to take two angles of a triangle as input and find the third angle(Right Angled Triangle)

import java.util.Scanner;
class ThirdAngle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st side of the triangle");
        int x=sc.nextInt();
        System.out.println("Enter 2nd side of the triangle");
        int y=sc.nextInt();
        if (x <= 0 || y <= 0 || x+y >= 180) {
        System.out.println("Invalid angles. The sum of the two angles must be less than 180 degrees and both angles must be positive.");
        }
        x=x*x;
        y=y*y; 
        int z=x+y;
        System.out.println("Third Angle of the Right Angled Triangle is: "+z);



    }
}