class Solution {
    public List<Integer> valueEqualToIndex(List<Integer> nums) {
        List<Integer> s = new ArrayList<>();
        for (int i = 0; i <nums.size(); i++) {
            if (i+1== nums.get(i)) {
                s.add(nums.get(i));
            }
        }
        return s;
    }
}
