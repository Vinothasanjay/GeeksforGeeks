class Solution {
    public int lastIndex(String s) {
        int j=-1;
        char[] n=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(n[i]=='1'){
                j=i;
            }
        }
        if(j<0){
            return -1;
        }
        else{
            return j;
        }
    }
}
