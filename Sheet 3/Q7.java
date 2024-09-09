// Write a program to find sum of all even numbers between 1 to n.
import java.util.Scanner;
class SumEven{
    public static void main(String[] rajat){
        Scanner sc= new Scanner(System.in);
        int j=0,k;
        System.out.print("Enter Number: ");
        k= sc.nextInt();
        for (int i=1;i<=k*2;i++){
            if (i%2==0){
                j=i+j;
            }
        }
        System.out.println("Sum of "+k+" even Numbers is: "+ j);

        
    }
}