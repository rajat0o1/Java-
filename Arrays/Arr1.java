class Arrayy{
    public  static void main(String[] args){


        // Static Declaration of Arrays-->
        int arr[]={1,2,3};
                        System.out.println(arr);

                System.out.println(arr.hashCode());

        System.out.println(arr[0]);

                System.out.println(arr[1]);
        System.out.println(arr[02]);



        // Dynamic Declaration of Arrays-->
        int arrr[]=new int[3];
          System.out.println(arrr);
          System.out.println(arrr.hashCode());
        arrr[0]=200;
        arrr[1]=400;
        arrr[2]=600;
        for (int i=0;i<3;i++){
        System.out.println(arrr[i]);
        }

        // System.out.println(arrr[0]);
        // System.out.println(arrr[1]);
        // System.out.println(arrr[2]);


    
    
    } 
}