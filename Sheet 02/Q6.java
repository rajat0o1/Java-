// 6 Take the age of the user as input, print if the user is an infant (Age 0-5) or teenager
// (Age 13-19), a senior citizen (>60), or Others

import java.util.Scanner;
class age{
    public static void main(String[] args){
        int age=0;
        System.out.println("Enter Age: ");
        Scanner sc= new Scanner(System.in);
        age=sc.nextInt();
        if ((age>=0) && (age<=5)){
            System.out.println("INFANT");

        }
        else if((age>12)&& (age<20)){
            System.out.println("Teenager");

        }
        else if((age>19)&&(age<60)){
            System.out.println("Adult");
        }
        else {
            System.out.println("Senior Citizen");

        }
    }
}