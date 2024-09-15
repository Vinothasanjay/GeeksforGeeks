class Solution {
    long floorSqrt(long n) {
        long d=(long)Math.sqrt(n);
        for(int i=1;i<n/2;i++){
            long f=(long)Math.pow(i,2);
            if(d==f){
                return d;
            }
        }
    
    return (long)Math.floor(d);
}
}
