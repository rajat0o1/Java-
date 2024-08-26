import java.util.Scanner;

 class SimpleSeriesSum {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Check if the number of terms is valid
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Calculate the sum of the first n terms
            int sum = 0;
            int firstTerm = 5;
            int commonDifference = 2;

            for (int i = 0; i < n; i++) {
                // Calculate the current term
                int currentTerm = firstTerm + i * commonDifference;
                // Add the current term to the sum
                sum += currentTerm;
            }

            // Print the result
            System.out.println("The sum of the first " + n + " terms is: " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}
