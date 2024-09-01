// 21 Write a program to calculate area of an equilateral triangle

import java.util.Scanner;
class EquilateralTriangleArea{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side of the trianlge");
        double side=sc.nextDouble();

        double area= ( 1.73 * side * side )/4;  
        System.out.println("Area  of Equilateral Triangle is: "+ area);

    }
}
