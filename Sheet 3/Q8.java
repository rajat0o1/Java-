// Write a program to find sum of all odd numbers between 1 to n.
import java.util.Scanner;
class SumOdd{
    public static void main(String[] rajat){
        Scanner sc= new Scanner(System.in);
        int i=0,j,k=0;
        System.out.print("Enter Number: ");
        j=sc.nextInt();
        for (i=1;i<=j*2;i++){
            if(i%2!=0){
                k=k+i;
            }
        }
        System.out.println("The Sum of "+j+" even numbers is: "+k);
    }
}