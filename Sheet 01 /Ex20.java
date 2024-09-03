// Write a program to enter base and height of a triangle and find its area

import java.util.Scanner;
class TriangleArea{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Height of the Triangle: ");
        double height=sc.nextDouble();
        System.out.println("Enter base of the Triangle: ");
        double base=sc.nextDouble();
        double area=(height*base)/2;
        System.out.println("Area of the triangle is: "+area);
    }
}