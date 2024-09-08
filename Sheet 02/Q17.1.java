// Write a program to input month number and print that month.
import java.util.Scanner;
class CheckMonthName{
    public static void main(String[] args){
        System.out.println("Enter Month number: \n1.Jan \n2. Feb\n3.Mar\n4.Apr\n...\n12.Dec");
        System.out.print("Enter Your Choice: ");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();

        String month;

        switch(x){
            case 1: 
            // month="JANUARY";
            System.out.println("Your Monh number is "+x+": JANUARY");
            break;
            
            case 2: 
            // month="FEBRUARY";
            System.out.println("Your Monh number is "+x+": FEBRURAY");

            break;
            
            case 3: 
            // month="MARCH";
            System.out.println("Your Monh number is "+x+": MARCH");

            break;
            
            case 4: 
            // month="APRIL";
            System.out.println("Your Monh number is "+x+": APRIL");
            break;
            
            case 5: 
            // month="MAY";
            System.out.println("Your Monh number is "+x+": MAY");
            break;
            
            case 6: 
            // month="JUNE";
            System.out.println("Your Monh number is "+x+": JUNE");
            break;
            
            case 7: 
            // month="JULY";
            System.out.println("Your Monh number is "+x+": JULY");
            break;
            
            case 8: 
            // month="AUGUST";
            System.out.println("Your Monh number is "+x+": AUGUST");
            break;
            
            case 9: 
            // month="SEPTEMBER";
            System.out.println("Your Monh number is "+x+": SEPTEMBER");
            break;
            
            case 10: 
            // month="OCTOBER";
            System.out.println("Your Monh number is "+x+": OCTOBER");
            break;
            
            case 11: 
            // month="NOVEMBER";
            System.out.println("Your Monh number is "+x+": NOVEMBER");
            break;
            
            case 12: 
            // month="DECEMBER";
            System.out.println("Your Monh number is "+x+": DECEMBER");
            break;
            
            default: 
            System.out.println("Enter a valid Number between 1-12");

        }
        // System.out.println(month);
    }
}