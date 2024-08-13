//  WAP to create an int array with size 10.
class Test{
    public static void main(String[] args){
        int a[]=new int[10];
        for (int i=0;i<a.length;i++){
            a[i]=i;
        }
        for (int i=0;i<=10;i++){
            System.out.println(a[i]);
        }
        System.out.println("Length is: "+a.length);

}
}