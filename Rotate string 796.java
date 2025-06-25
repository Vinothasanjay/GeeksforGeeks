class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length()==goal.length() && (s+s).contains(goal);
    }
}
// any rotated string have same length and it must be a substring
//if s=abcde and goal=cdeab
// then abcdeabcde contains goal
