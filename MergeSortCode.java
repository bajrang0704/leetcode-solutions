import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
       int[] arr={5,4,3,2,1};
       int[] arr2=merge(arr);
       System.out.print(Arrays.toString(arr2));
    }
    public static int[] merge(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left =merge(Arrays.copyOfRange(arr,0,mid));
        int[] right =merge(Arrays.copyOfRange(arr,mid,arr.length));
        
        return order(left,right);
    }
    private static int[] order(int[] start,int[] end){
        int[] mix=new int[start.length+end.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<start.length && j<end.length){
            if(start[i]<end[j]){
                mix[k]=start[i];
                i++;
            }else{
                mix[k]=end[j];
                j++;
            }
            k++;
        }
        while(i<start.length){
            mix[k]=start[i];
            i++;
            k++;
        }
        while(j<end.length){
            mix[k]=end[j];
            j++;
            k++;
        }
        return mix;
    }
}
