class Solve {
    int[] findTwoElement(int arr[], int n) {
        HashSet<Integer> set=new HashSet<>();
        int j=0;
        for(int i:arr){
            if(!set.contains(i)){
                set.add(i);
            }
            else{
                 j=i;
                 break;
            }
        }
        long originalSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        for (int k : arr) {
            actualSum += k;
        }

        int missing = (int) (originalSum - (actualSum - j));
        return new int[]{j,missing};
    }
}
