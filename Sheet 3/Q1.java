// Write a program to print all natural numbers from 1 to n.import java.util.Scanner;
class NaturalNumbers{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length for Natural Number: ");
        int num=sc.nextInt();
        for (int i=1;i<=2000;i++){
            if (i<=num)
            System.out.println(i);
        }

    }
}