
class Sol
{
    Boolean check (String s)
    {
        HashSet<Character> str=new HashSet<>();     
        for(int i=0;i<s.length();i++){
            str.add(s.charAt(i));
        }
        if (str.size()==1){
                return true;
        }
        else{
            return false;
        }
    }
}
