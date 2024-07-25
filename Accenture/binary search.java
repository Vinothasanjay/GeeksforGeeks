class Solution {
    public int binarysearch(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == k)
        return mid;

      if (arr[mid] < k)
        low = mid + 1;

      else
        high = mid - 1;
    }

    return -1;
  }
            
            
        }
