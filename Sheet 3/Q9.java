// Write a program to print multiplication table of any number.
import java.util.Scanner;
class Table{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int i=0,j,k;
        System.out.print("Enter Number: ");
        j=sc.nextInt();
        for ( i=j; i<=j*10; i++)
        System.out.println(i);

    }
}