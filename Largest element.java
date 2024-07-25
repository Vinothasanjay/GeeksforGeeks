class Solution {
    public static int largest(int n, int[] arr) {
        //HashSet<Integer> h=new HashSet<>();
        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
        
    }
}
