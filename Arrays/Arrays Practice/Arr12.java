// WAP to create an array with size 10 and initialize the array element using keyboard and find out
//  the smallest and largest elements position in the array. 

class Test{
    public static void main(String[] args){
    int[] arr = {50, 45, 75, 8855, 4558, 455, 789, 8844,  46};

    int largest=arr[0];
    int Lposition=0;

    int smallest=arr[0];
    int Sposition=0;

     for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                Sposition=i;
            }
            if (arr[i] > largest) {
                largest = arr[i];
                Lposition=i;
            }
        }

        System.out.println("Largest Element is: " +largest + " \nand it's position is: "+ Lposition);
        System.out.println("Smallest Element is: " +smallest + "\nand it's position is: "+ Sposition);

    }
}