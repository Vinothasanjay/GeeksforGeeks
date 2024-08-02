class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        char[] s=str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
        return new String(s);
        }
}
