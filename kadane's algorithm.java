class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {
        int a=arr[0];
        int b=arr[0];
        for(int i=;i<arr.length;i++){
            b=Math.max(b+arr[i],arr[i]);
            a=Math.max(a,b);
        }
        return a;
    }
}
