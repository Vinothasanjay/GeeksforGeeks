class Solution {

    static int search(int arr[], int x) {
        //int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
                
            }
        }
        return -1;
        
    }
}
