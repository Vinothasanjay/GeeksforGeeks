class Solution {
    void leftRotate(int arr[], int d) {
        int n=arr.length;
        d%=n;
        reverse(arr,0,n-1);//if right first full reverse,next d,next from d.
        reverse(arr,n,d);
        reverse(arr,0,n-d);
        
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
