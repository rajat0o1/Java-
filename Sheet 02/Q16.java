// Write a program to input week number and print week day (Week starts on Monday and
// ends on Sunday).
import java.util.Scanner;
class PrintWeekDay{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Day Number: ");
        System.out.println("1: Monday\n2:Tuesday.....7: Sunday");
        int x=sc.nextInt();
        char day;
        switch(x){
            case 1:
                System.out.println("Monday");
                break;
            
            case 2:
                System.out.println("Tuesday");
                break;
            
            case 3:
                System.out.println("wednesday");
                break;
                
            case 4:
                System.out.println("Thursday");
                break;
                
            case 5:
                System.out.println("Friday");
                break;
                
            case 6:
                System.out.println("Saturday");
                break;
                
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter Valid Number Between 1 to 7 ");
                
          
        }
        
    }
}