class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        int s=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[s];
            arr[s]=temp;
            s++;
        }
        }
        
    }
}
