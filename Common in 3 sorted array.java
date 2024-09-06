class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        LinkedHashSet<Integer> set1 = new LinkedHashSet<>(arr1);
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>(arr2);
        LinkedHashSet<Integer> set3 = new LinkedHashSet<>(arr3);
        ArrayList<Integer> list=new ArrayList<>();
       for(int i:set1){
           if(set2.contains(i) && set3.contains(i)){
               list.add(i);
           }
       }
       return list;
    }
}
