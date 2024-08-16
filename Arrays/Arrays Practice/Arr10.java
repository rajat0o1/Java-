// * WAP to create an array with size 10 and initialize the array element
//  using keyboard and display the square of each element
import java.util.Scanner;
class ArrayElemSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.print("Please Enter Array Element "+(i+1)+": ");
            arr[i]=sc.nextInt();

                }
            System.out.println();
        for (int i=0;i<arr.length;i++){
            // arr[i]=(i+1);
                    int square =arr[i]*arr[i];
            System.out.println("The square of "+ arr[i]+" is :"+ square);
        }
    }
}


