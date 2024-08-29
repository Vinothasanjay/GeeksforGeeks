class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String[] s=S.split("\\.");
        StringBuilder res=new StringBuilder();
        for(int i=s.length-1;i>=0;i--){
            res.append(s[i]);
            if(i>0){
                res.append(".");
            }
        }
    return res.toString();
    }
}
