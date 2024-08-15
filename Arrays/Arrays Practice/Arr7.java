// * WAP to create an array with size 10 and initialize the array element with table of 10 and display it.

class TableOfTen{
    public static void main(String[] args){
        int Size=10;
        int arr[]=new int[Size+1];
        for (int i=0;i<arr.length;i++){
            arr[i]=i*10;
            System.out.println(arr[i]);
        }
    
    


    }
}