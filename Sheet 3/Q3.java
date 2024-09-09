// Write a program to print all alphabets from a to z.

import java.util.Scanner;
class PrintAlphabet{
    public static void main(String[] args){
        System.out.println("UPPERCASE Alphabets: ");
        UpperCase();
        System.out.println(" ");



        System.out.println("LOWERCASE Alphabets: ");
        lowerCase();
        System.out.println(" ");




    }

public static void UpperCase(){
    for (char c= 'A'; c<='Z'; c++){
        System.out.print(c+" ");
    }
}
public static void lowerCase(){
    for(char c='a';c<='z'; c++){
        System.out.print(c+ " ");

    }
}

}