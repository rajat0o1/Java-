// * Write a program to convert the string from upper case to lower case.

import java.util.Scanner;
class Strings{
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Anything (not Numbers): ");
        String str= sc.nextLine();
        str=str+32;
        System.out.println(str);
    }

}

