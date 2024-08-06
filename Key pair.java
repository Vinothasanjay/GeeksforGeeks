class Solution {
    boolean hasArrayTwoCandidates(int arr[], int x) {
        int n=arr.length;
        boolean ans=false;
        
        int i = 0, j = 1;

        while (i < n - 1) {
            while (j < n) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
                j++;
            }
            i++;
            j = i + 1; 
        }

        return false;
    }
}
