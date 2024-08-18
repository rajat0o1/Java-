

// * check the possition in the array of given element
import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
        int Given=0;
        Given=sc.nextInt();
        boolean found=false;
        int arr[]= {1,2,3,4,5,6,7};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Given) {
                System.out.println("Matched " + arr[i]+" is at position "+i );
                found = true;  
                break;  
            }
        }
            if(!found){
                System.out.println("Element not found");
            }
            sc.close();
        
          


    }
}