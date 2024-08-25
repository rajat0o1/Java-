// Take a number (say 'n') , calculate sum of first 'n' odd numbers, print it on the screen

import java.util.Scanner;
class Ndd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first n: ")  ;
        int n=sc.nextInt();
        System.out.println();
        for (int i=0;i<=n*2;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}