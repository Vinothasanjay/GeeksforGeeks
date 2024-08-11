class Solution {
    // Function to return the count of the number of elements in
    // the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        HashSet<Integer> inter=new HashSet<>();
        for(int j:b){
            if(set.contains(j)){
                inter.add(j);
            }
        }
        return inter.size();
}
}
