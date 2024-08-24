// * insert given element at the last position of the array
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3}; 
        int elementToAdd = 4; 
        int[] newArray = new int[originalArray.length + 1];
        
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        
        newArray[originalArray.length] = elementToAdd;
        
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}
