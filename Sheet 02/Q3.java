// 3 Take the age of the user as input, print if the user is a teenager


import java.util.Scanner;
class TeenAger{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Age as an Input: ");
        int age=sc.nextInt();
        // 
        if ((age>12)&&  (age<20))
        System.out.println("Teenager: Beware of my Tantrums");
        else if (age>=20)
        System.out.println("Young");
        else    
        System.out.print("Kid");


    }
}
