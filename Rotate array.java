class Solution 
{
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d, int n) 
    {
        while(d>n)
            d=d-n;
        int[] a=new int[d];
        for(int i=0;i<d;i++)
        {
            a[i]=arr[i];
        }
        for(int i=0;i<n-d;i++)
        {
            arr[i]=arr[d+i];
        }
        int k=0;
        for(int i=n-d;i<n;i++)
        {
            arr[i]=a[k];
            k+=1;
        }
       
    }
}
