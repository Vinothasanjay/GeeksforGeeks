class Solution {
    static String javaSub(String S, int L, int R) {
       StringBuilder str=new StringBuilder(S);
       return str.substring(L,R+1).toString();
    }
}
