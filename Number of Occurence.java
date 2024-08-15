class Solution {
    int count(int[] arr, int n, int x) {
        int c=0;
        for(int i:arr){
            if(i==x)
                c=c+1;
        }
        return c;
    }
}
