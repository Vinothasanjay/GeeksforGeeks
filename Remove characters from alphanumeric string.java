class Solution {
    String removeCharacters(String S) {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<S.length();i++){
            if(Num(S.charAt(i))){
                str.append(S.charAt(i));
            }
        }
        return str.toString() ;
        
    }
    public boolean Num(char c){
        //int d=c;
        if(c>='0' && c<='9'){
            return true;
        }
        else{
            return false;
        }
    }
}
