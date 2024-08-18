// * count the even and odd elements of the array.
class Test{
    public static void main(String[] args){
        int EvenCount=0,OddCount=0;
        int []arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i=0;i<arr.length;i++){
            if (arr[i]%2==0){
             EvenCount++;
            }
            if (arr[i]%2 != 0){
                OddCount++;
            }

        }
        System.out.println("Even Count: "+EvenCount);
        System.out.println("Odd Count: "+OddCount);
        
        
    }
}
