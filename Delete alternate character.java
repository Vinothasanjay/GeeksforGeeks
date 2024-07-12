class Solution {
    static String delAlternate(String S) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S.length();i+=2){
            str.append(S.charAt(i));
        }
        return new String(str);
    }
}
