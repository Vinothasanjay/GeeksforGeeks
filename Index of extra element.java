class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
      
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]!=arr2[j]){
                return i;
            }
            i++;
            j++;
        }
        return -1;
    }
}
