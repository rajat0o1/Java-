//  Take a number (say 'n') , calculate the 'nth' even numbers, print it on the screen 

import java.util.Scanner;
class NThEven{
    public static void main(String[] args){
        int n=0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        
        n=sc.nextInt();

        int even=0;

        for(int i=0;i<=n*2;i++){

            if (i%2==0){
                even=2*(n-1);

            }
        }
        System.out.println(even);
    }
}