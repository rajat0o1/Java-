// Take the price of an item as input from the user. Also take input the rate of GST on the
// item. print the final price of the item by adding GST amount to the price.

import java.util.Scanner;
class GST{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Price: ");
        double price=sc.nextDouble();
        System.out.print("Enter GST: ");
        double gst= sc.nextDouble();
        gst = (price*gst)/100 ;


        double finalPrice= gst+price;
        System.out.println("Final Price after GST is: " + finalPrice);

            }
}