class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
       // int n=arr.length-1;
        return arr[k-1];
        
    } 
}
