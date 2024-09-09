// Write a program to find sum of all natural numbers between 1 to n.
import java.util. Scanner;
class SumNatural{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int j=0,k;
        System.out.print("Enter Number: ");
        k=sc.nextInt();

        for (int i=1;i<=k;i++){
            j=j+i;

        }
        System.out.println("The Sum of "+k+" Natural number is: "+j);




    }
}