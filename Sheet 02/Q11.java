// Write a program to check whether a character is a letter of English alphabet or not.
import java.util.Scanner;

class AlphabetOrNot{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter CHaracter: ");
        
        char ch = sc.nextChar();
        if((ch>="a") && (ch<="z") ||  (ch>="A") && (ch<="Z")){
            System.out.println(ch+" is Alphabet");
        }
        else {
            System.out.println(ch+" isn't Alphabet");


        }




    }
}


