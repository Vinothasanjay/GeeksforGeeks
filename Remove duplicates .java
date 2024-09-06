class Solution {
    String removeDups(String str) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char i:str.toCharArray()){
            set.add(i);
            //set.toString();
        }
        StringBuilder sb=new StringBuilder();
        for(char c:set){
            sb.append(c);
        }
        return sb.toString();
    }
}
