
class Solution {
    String removeDuplicates(String str) {
    HashSet<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();

     
        for (char i : str.toCharArray()) {
    
            if (!set.contains(i)) {
                set.add(i);
                result.append(i);
            }
        }

        return result.toString();
    }
}
