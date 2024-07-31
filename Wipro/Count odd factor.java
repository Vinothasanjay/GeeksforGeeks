
class Solution{
    static long count(int N)        
    {
        return (long)Math.floor(Math.sqrt(N));
        
    }
}
//Since only perfect square numbers only have odd factors we use this method.
//Or we can count the number of perfect square less than given number.
