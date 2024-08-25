// Take radius of a circle , calcualte its perimeter and area, then print it on the screen

import java.util.Scanner;
class PerimeterAndArea{
    public static void main(String[] args){
        float x=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number as Radius: ");
        x=sc.nextInt();
        float radius=x*x;
        float peri=2*3.14f*x;
        float area=3.14f*radius;
        System.out.println("Perimeter: "+peri);
        System.out.println("Area: "+area);

    }
}