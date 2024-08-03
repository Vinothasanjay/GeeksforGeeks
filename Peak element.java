class Solution
{
	// Function to find the peak element
	// arr[]: input array
	// n: size of array a[]
	public int peakElement(int[] arr,int n)
    {   
        int peak=0;
        if(n==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(arr[i]>=arr[i+1]){
                    return i;
                }
            }
            else if(i==n-1){
                if(arr[i]>=arr[i-1]){
                    return i;
                }
            }
            else{
            
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
                return i;
            }
            
        }
        }
        return -1;
    }
}
