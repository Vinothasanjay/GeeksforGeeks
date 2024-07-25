class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        if(n<=0){
            return new long[0];
        }
        if(n==1){
            return new long[]{1};
        }
        long[] ans=new long[n];
        long a=1,b=1;
        ans[0]=a;
        ans[1]=b;
        for(int i=2;i<n;i++){
            ans[i]=a+b;
            a=b;
            b=ans[i];
        }
        return ans;
        //return new int[]
    }
}
#Accenture
