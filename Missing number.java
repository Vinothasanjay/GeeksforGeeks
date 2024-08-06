class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
       int sum=0;
       for(int i=0;i<n-1;i++){
           sum+=arr[i];
       }
       int sum1=(n*(n+1))/2;
       return sum1-sum;
        
    }

}
another
class Solution {

    // Note that the size of the array is n-1
    int missingNumber(int n, int arr[]) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                return arr[i] + 1;
            }
        }
       
        if (arr[0] != 1) {
            return 1;
        }
        
        return arr[n - 2] + 1;
    }
    }
