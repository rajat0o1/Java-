// * WAP to create an array with size 10 and initialize the array element using keyboard and
//  display the smallest and largest elements

 class Test {
    public static void main(String[] args) {
        int[] arr = {50, 45, 45, 60, 4558, 455, 789, 8844,  46};
        
        int Largest = arr[0];
        int Smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < Smallest) {
                Smallest = arr[i];
            }
            if (arr[i] > Largest) {
                Largest = arr[i];
            }
        }

        System.out.println("Smallest number: " + Smallest);
        System.out.println("Largest number: " + Largest);
    }
}
