class Solution {
    public static ArrayList<Integer> duplicates(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
            }
            else{
                if(!list.contains(num))
                list.add(num);
            }
        }
        
        if(list.isEmpty()){
           list.add(-1);
            return list;
        }
        else{
            Collections.sort(list);
        }
        return list;
        
    }
}
