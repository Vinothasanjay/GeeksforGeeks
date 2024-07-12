class Sol
{
    int[] count (String s)
    {
        int c=0;
        int d=0;
        int g=0;
        int f=0;
        for(int i=0;i<s.length();i++){
            if(Upper(s.charAt(i))){
                c=c+1;
            }
            else if(Lower(s.charAt(i))){
                d=d+1;
            }
            else if(Num(s.charAt(i))){
                g=g+1;
            }
            else{
                f=f+1;
            }
        }
        return new int[]{c,d,g,f};
    }
    public boolean Upper(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean Lower(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        else{
            return false;
        }
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
