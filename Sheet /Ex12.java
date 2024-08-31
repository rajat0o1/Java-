// Take a number (say 'n') , calculate sum of first 'n' terms of following series, print it on the screen
// 5 7 9 11 13 .......

import java.util.Scanner;
class SeriesSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n: (only Positive)");
        int n=sc.nextInt();
  
        int r=n*(n+4);
        int res=r;
        System.out.println("Answer is: "+res);

    }
}
