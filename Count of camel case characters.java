
class Sol
{
    int countCamelCase (String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++){
            if(Upper(s.charAt(i))){
                c=c+1;
            }
        }
        return c;
    }
    public boolean Upper(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        else{
            return false;
        }
    }
}
