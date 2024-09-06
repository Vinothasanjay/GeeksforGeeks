
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        int[] arr=new int[128];
        char[] c=S.toCharArray();
        for(int i=0;i<S.length();i++){
            arr[S.charAt(i)]=arr[S.charAt(i)]+1;
        }
        for(int i=0;i<S.length();i++){
            if(arr[S.charAt(i)]==1)
                return S.charAt(i);
        }
        return '$';
    }
}
