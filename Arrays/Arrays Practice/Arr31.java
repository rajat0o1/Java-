// merge two array into single array

import java.util.Arrays;
class Merge{
    public static void main(String[] args){
        int []a={101,102,103,104};
        int b[]={201,202,203,204};
        int []c= new int[a.length+ b.length];
        for (int i=0;i<a.length;i++){
            c[i]=a[i];
            
        }
        for (int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
            
        }
        for (int i=0;i<c.length;i++)
        System.out.print(c[i]+" " );
    }
}