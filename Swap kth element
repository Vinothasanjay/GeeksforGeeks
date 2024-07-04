
class Solution {
    public static void swapKth(int n, int k, int[] arr) {
        int temp=arr[k-1];
        arr[k-1]=arr[n-k];
        arr[n-k]=temp;
        
        
        }
    }
without third variable
arr[k - 1] = arr[k - 1] + arr[n - k];
arr[n - k] = arr[k - 1] - arr[n - k];
arr[k - 1] = arr[k - 1] - arr[n - k];
