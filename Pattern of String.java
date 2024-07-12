class Solution {
    ArrayList<String> pattern(String S) {
        ArrayList <String> str=new ArrayList<>();
        int n=S.length();
        for(int i=n;i>0;i--){
            str.add(S.substring(0,i));
        }
        return str;
            }
            
        }
    
