 /*def isBinary(string):
    for char in string:
        if char != '0' and char != '1':
            return 0
    return 1
Remove whitespace in java */
class Solution
{
   
    String modify(String S)
    {
        String trimmedString = S.replaceAll("\\s", "");
        return trimmedString ;
    }
}
