


// Write a program to input any letter and check whether it is a vowel or consonant.
import java.util.Scanner;

class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String ch = sc.next();

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}