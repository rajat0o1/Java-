// * insert given element at the last position of the array
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3}; // Original array
        int elementToAdd = 4; // Element to add
        
        // Create a new array with one more slot
        int[] newArray = new int[originalArray.length + 1];
        
        // Copy elements from the original array to the new array
        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i];
        }
        
        // Add the new element to the end of the new array
        newArray[originalArray.length] = elementToAdd;
        
        // Print the new array
        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}
