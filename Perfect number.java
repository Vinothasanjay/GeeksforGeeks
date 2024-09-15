class Solution {
    static int isPerfectNumber(long N) {
  if (N < 2) {
            return 0;  
        }
        
        long sum = 1; 
        long sqrt = (long)Math.sqrt(N);  

        for (int i = 2; i <= sqrt; i++) {
            if (N % i == 0) {
                sum += i;
                if (i != N / i) {
                    sum += N / i;
                }
            }
        }

        return (sum == N) ? 1 : 0;
    }
}
