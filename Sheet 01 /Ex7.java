// Take length and breadth of a rectangle , calcualte its perimeter and area, then print it on the screen

import java.util.Scanner;

class Rectangle{
    public static void main(String[] args){
        float length,breadth;
    
        Scanner sc = new Scanner(System.in);    

        System.out.print("Enter Length and Breadth of Rectangle: ");
        length= sc.nextFloat();
        breadth= sc.nextFloat();

        float perimeter= 2*(length+breadth);
        float area=length*breadth;

        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);


    }
}