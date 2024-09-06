
class Solution
{
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
     
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
  
        for (char i : line.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
     
        int maxFrequency = -1;
        char maxChar = ' ';

        for (char key : map.keySet()) {
            int ferq=map.get(key);
            if (ferq > maxFrequency || ferq==maxFrequency && key<maxChar ) {
                maxFrequency = map.get(key);
                maxChar = key;
            }
        }
     
        return maxChar;
    }
}
