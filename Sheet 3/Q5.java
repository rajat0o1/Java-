// Write a program to print all odd number between 1 to 100.
import java.util.Scanner;
class OddPrint{
    public static void main(String[] args){
        System.out.println("Odd Numbers From 1 To 100 are: ");
        for (int i=1;i<=100;i++){
            if (i%2!= 0 ){
                System.out.print(i+ " ");
            }
        }
    }
}
d