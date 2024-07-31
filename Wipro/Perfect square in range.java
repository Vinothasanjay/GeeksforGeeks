
class Solution {
    static int numOfPerfectSquares(int a, int b) {
         
        int start = (int) Math.ceil(Math.sqrt(a));//if 3.657 gives 4
    
        int end = (int) Math.floor(Math.sqrt(b));// if 5.00 gives 5

        
        if (start > end) {
            return 0; 
        }
        return end - start + 1;
    }
}
//Generally the perfect squres can be calculated by finding small and large perfect square and subtracting it
//large-small+1
