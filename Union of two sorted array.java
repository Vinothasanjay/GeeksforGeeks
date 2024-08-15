class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            set.add(i);
        }
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}

