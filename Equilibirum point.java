
class Solution {
    // arr: input array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[]) {
        int sum=0;
       int left=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
       }
       for(int j=0;j<arr.length;j++){
           sum=sum-(int)arr[j];
           if(left==sum){
               return j+1;
           }
           else{
               left+=arr[j];
           }
       }
       return -1;
    }
}
