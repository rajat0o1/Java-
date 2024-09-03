// 2 Take 3 numbers as input from user, print the largest number on the screen
import java.util.Scanner;
class LargestOfThree{
    public static void main(String[] args){

    Scanner sc= new Scanner(System.in); 
    System.out.println("Enter Three Numbers: ");
    int one = sc.nextInt();
    int two = sc.nextInt();
    int three = sc.nextInt();

    if ((one > two) && (one > three))
    {
        System.out.println(one);
    }
    else if((two>one) && (two> three))
    {
        System.out.println(two);

    }
    else {
        System.out.println(three);
    }
    }





}