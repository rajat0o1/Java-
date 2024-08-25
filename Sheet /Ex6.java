// 6 Take side of a square , calcualte its perimeter and area, then print it on the screen 6

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Side of Square: ");

        int side=sc.nextInt();
        int perimeter=4*side;
        side=side*side;

        int area=side;
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Area: "+area);



        
    }
}