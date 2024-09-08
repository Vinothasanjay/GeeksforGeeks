class Solution
{
    public int gcd(int N , int arr[]) 
    { 
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=gcd(res,arr[i]);
        }
       if(res==1){
           return 1;
       }
       return res;
}
 public int gcd(int a,int b){
            if(b==0){
                return a;
            }
            
           return gcd(b,a%b);
        }
}
