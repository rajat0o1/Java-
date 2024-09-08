// Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.
// Calculate percentage and grade according to following:
// Percentage >= 90% : Grade A
// Percentage >= 80% : Grade B
// Percentage >= 70% : Grade C
// Percentage >= 60% : Grade D
// Percentage >= 40% : Grade E
// Percentage < 40% : Grade F

import java.util.Scanner;

class Grade{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Numbers of Physics: ");
        double phy= sc.nextDouble();

        System.out.println("Enter Numbers of Chemistry: ");
        double chem= sc.nextDouble();

        System.out.println("Enter Numbers of Biology: ");
        double bio=sc.nextDouble();

        System.out.println("Enter Numbers of Mathematics: ");
        double math  = sc.nextDouble();

        System.out.println("Enter Numbers of Computer: ");
        double comp= sc.nextDouble();

        double res;
        res= comp+math+bio+chem+phy;
        double Percentage= res/5;

        if (Percentage >= 90 ){
            System.out.println("Grade A");
        }
        else if(Percentage >= 80){
            System.out.println("Grade B");


        }
        else if(Percentage >= 70){
            System.out.println("Grade C");

        }
        else if(Percentage >= 60){
            System.out.println("Grade D");

        }
        else if(Percentage >= 40){
            System.out.println("Grade E");

        }
        else if( Percentage < 40){
            System.out.println("Grade F");

        }





    }
}