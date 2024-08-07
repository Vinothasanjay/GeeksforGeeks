class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        int small=Integer.MAX_VALUE;
        int secondsmall=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=small && arr[i]<secondsmall){
                secondsmall=arr[i];
            }
        }
        if(secondsmall==Integer.MAX_VALUE){
            return new int[] {-1};
        }
        return new int[]{small,secondsmall};
    }
}
