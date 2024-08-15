// * WAP to create an array with size 10 and assign a value using keyboard and after reading display the value of array.

import java.util.Scanner;
class Test{
    public static void main(String[] args){
        int SIZE=15;
        int []arr=new int[SIZE];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("\n"+arr[i]);
        }


    }
}