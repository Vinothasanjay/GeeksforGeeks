class Solution {
    public String modify(String s) {
        char[] arr = s.toCharArray();
        int s1 = 0;
        int g = arr.length - 1;
        
        while (s1 < g) {
            while (s1 < g && !isVowel(arr[s1])) {
                s1++;
            }
            while (s1 < g && !isVowel(arr[g])) {
                g--;
            }
            if (s1 < g) {
                char temp = arr[s1];
                arr[s1] = arr[g];
                arr[g] = temp;
                s1++;
                g--;
            }
        }
        
        return new String(arr);
    }
    
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

