class Solution {
    public static int doUnion(int arr1[], int arr2[]) {
         HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        return set.size();
    }
}
