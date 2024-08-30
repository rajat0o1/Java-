// Take a number (say 'n') , calculate sum of first 'n' terms of following series, print it on the screen
// 5 7 9 11 13 .......

import java.util.Scanner;
class xyz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n=sc.nextInt();
        for (int i=5;i<=100;i+=2){
            int j=i;
            System.out.println(j);
        }
    }
}
