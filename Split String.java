class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        String s1="";
        String s2="";
        String s3="";
        for(int i=0;i<S.length();i++){
            if(Character.isAlphabetic(S.charAt(i))){
                s1=s1+S.charAt(i);
            }
            else if(Character.isDigit(S.charAt(i))){
                s2=s2+S.charAt(i);
            }
            else{
                s3=s3+S.charAt(i);
            }
        }
        ArrayList<String> str=new ArrayList<>();
        str.add(s1);
        str.add(s2);
        str.add(s3);
        return str;
    }
}
