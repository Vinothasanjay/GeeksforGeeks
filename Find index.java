class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int arr[], int n, int key) 
    { 
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if(start==-1){
                    start=i;
                }
                end=i;
            }
        }
        return new int[]{start,end};
    }
    
}
