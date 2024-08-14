// WAP to create an array with size 10 and assign default initial value (1,2,3,....10)

class Test{
    public static void main(String[] args){
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
            System.out.println(arr[i]);
        }
    }
}