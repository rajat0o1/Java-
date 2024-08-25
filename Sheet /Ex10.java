//  Take a number (say 'n') , calculate sum of first 'n' even numbers, print it on the screen 4 20

import java.util.Scanner;
class NEven{
    public static void main(String[] args){
        int n=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number: ");
        n=sc.nextInt();
        for (int i=0;i<=n*2;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }

    }
}