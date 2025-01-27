class Solution {
    public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) { // Fixed missing closing brace for 'for' loop
            if (arr.get(i) == k) {
                return i+1; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }
}
