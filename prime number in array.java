import java.util.*;
class HelloWorld {
   /// int max=0;
    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,11};
        int sum=0;
        int j=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(Array(arr[i])){
                //System.out.print(arr[i]);
                sum+=arr[i];
                if(arr[i]>max){
                    max=arr[i];
                }
            }
        }
       // System.out.print(max);
    
        System.out.print(sum-max);
    }

    public static boolean Array(int num){
        //int max=0;
        if(num==2){
            return true;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }
            
        }
        return true;
    }
}
