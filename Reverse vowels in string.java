class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); 
        int i = 0, j = chars.length - 1;

        while (i < j) {
            if (isVowel(chars[i]) && isVowel(chars[j])) {
                swap(chars, i, j);
                i++;
                j--;
            } else if (isVowel(chars[i])) {
                j--;
            } else if (isVowel(chars[j])) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return new String(chars); 
    }

    public boolean isVowel(char c) {
        return "AEIOUaeiou".indexOf(c) != -1; 
    }

    public void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
