class Solution {
    void segregate0and1(int[] arr) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[s];
                arr[s]=temp;
                s++;
            }
        }
    }
}
