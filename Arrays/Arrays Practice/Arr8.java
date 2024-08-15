// * WAP to create an array with size 10 and initialize the array element using keyboard and calculate the sum of all array elements 
import java.util.Scanner;

class Test{
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        int sum=0;

        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

            sum=sum+arr[i];


        }
            System.out.println("Sum of all the array Elements is: " + sum);
    }
}
