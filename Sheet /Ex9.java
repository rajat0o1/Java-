// Take a number (say 'n') , calculate the 'nth' odd number, print it on the screen 4 

import java.util.Scanner;

class NThOdd{
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no: ");
        n=sc.nextInt();
        int odd=0;
        for (int i=0;i<=n*2;i++){
            if (i%2!=0){
                odd=(n*2)-1;

            }
        }
        System.out.println(odd);

    }
}