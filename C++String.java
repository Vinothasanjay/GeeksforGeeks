class Sol
{
   String conCat(String s1 , String s2)
   {
       String s3=s1+s2;
       return s3;
   }
}
class Solution {
    static String conRevstr(String S1, String S2) {
        String s3=S1+S2;
        StringBuilder str=new StringBuilder(s3);
        return str.reverse().toString();
    }
}
