class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            n=Getnumber(n);
            if(n==1){
                return true;
            }
        }
        return false;
    }
    public static int Getnumber(int n){
        int o=0;
        while(n>0){
            int d=n%10;
            o+=d*d;
            n=n/10;
        }
        return o;
    }
    }
