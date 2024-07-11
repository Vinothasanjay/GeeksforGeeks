class Solution {
    public static String longest(int n, String[] names) {
        if (n == 0 || names == null || names.length == 0) {
            return "";
        }

        String h = names[0];
        int max = h.length();

        for (String num : names) {
            if (num.length() > max) {
                max = num.length();
                h = num;
            }
        }

        return h;
    }
        
    }
