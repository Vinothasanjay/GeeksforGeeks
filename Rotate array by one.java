class Solution {
    public void rotate(int[] arr) {
        int n=arr.length;
        int d=1;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
    }
    static void reverse(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
