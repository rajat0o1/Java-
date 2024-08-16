//  WAP to create an array with size 10 and initialize the array element using keyboard 
// and calculate the sum and average of all array elements

class SumNAverage{
    public static void main(String[] args){
        final int Size=10;
        int sum=0,average=0;
        int arr[]=new int[Size];

        for(int i=0;i<arr.length;i++){
            sum=sum+(i+1);
            average=sum/(Size);



        }
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+average);

        
    }
}