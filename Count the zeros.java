class Solution {
    int countZeroes(int[] arr) {
        int c=0;
        for(int i:arr){
            if(i==0){
                c=c+1;
            }
        }
        return c;
    }
}
