class GfG
{
    //Function to locate the occurrence of the string x in the string s.
    int strstr(String s, String x)
    {
        if(s.contains(x)){
            return s.indexOf(x);
        }
        else{
            return -1;
        }
}
}
