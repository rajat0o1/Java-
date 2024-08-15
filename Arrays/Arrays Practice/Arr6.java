// * WAP to create an array with size 10 and initialize the array element with table of 5 and display it.


class Test{
    public static void main (String[] args){
        final int Size=10;

        int arr[]=new int[Size + 1];
        for (int i=0;i<arr.length;i++){
            arr[i]=i*5;
            System.out.println("5 * "+i+" = " +arr[i]);
 
        }

    }
}