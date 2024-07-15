class Solution {
    static long squaresInMatrix(int m, int n) {
       long c=0;
       for(int s=1;s<=Math.min(m,n);s++){
           c+=(long)(m-s+1)*(n-s+1);
       }
       return c;
        }
       
        
        
        
    }
