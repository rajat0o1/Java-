// Write a program to take marks of five subjects (maximum marks that can be scored are 75) and
// calculate total, average and percentage

import java.util.Scanner;
class TotalAvgPerc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks out of 75 in five Subjects: ");
        double one=sc.nextDouble();
        double two=sc.nextDouble();
        double three=sc.nextDouble();
        double four=sc.nextDouble();
        double five=sc.nextDouble();
        double total = one+two+three+four+five;
        double avg=total/5;
        double percentage=total/(75*5) ;
        percentage=percentage*100;
        System.out.println("Total: "+total)
        System.out.println("Average: "+avg);
        System.out.println("Percentage: "+(float)percentage+"%");





        

    }
}
