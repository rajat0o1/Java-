// Take a number (say 'n') , calculate sum of first 'n' even numbers, print it on the screen


import java.util.Scanner;

class SumOfFirstNEven{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0,n=0;
        System.out.println("Enter Number: ");
        n=sc.nextInt();
        for (int i=0;i<=n*2;i++){
            if (i%2 == 0){
                sum= sum+i;

            }

        }
        
        System.out.println("Sum of First "+ n + " Even number is: "+sum);


    }
}