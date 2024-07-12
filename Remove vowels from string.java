class Solution {
    String removeVowels(String S) {
       StringBuilder str=new StringBuilder();
       //S=S.toLowerCase();
       for(int i=0;i<S.length();i++){
           if(!isVowel(S.charAt(i))){
               str.append(S.charAt(i));
           }
       }
       return new String(str);
    }
       public boolean isVowel(char c){
          // c=c.toLowerCase();
           return c=='a'||  c=='e'||  c=='i'||  c=='o'||  c=='u';
       }
    
}
