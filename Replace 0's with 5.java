
class Solution {
    int convertfive(int num) {
        String str = String.valueOf(num);
        char[] n = str.toCharArray();
        
        String s = "";
        
        for (char s1 : n) {
            if (s1 == '0') {
                s += '5';  
            } else {
                s += s1;   
            }
        }
        

        return Integer.parseInt(s);
    }
}
