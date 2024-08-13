class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        ArrayList<Integer> list=new ArrayList<>();
        int start=-1;
        int end=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(start==-1){
                    start=i;
                }
                end=i;
            }
        }
        if(start==-1 && end==-1){
            list.add(-1);
            return list;
        }
        list.add(start);
        list.add(end);
        return list;
    }
}
