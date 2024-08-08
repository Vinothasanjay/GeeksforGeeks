
class Solution
{
    static int majorityElement(int a[], int size)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)>size/2){
                return key;
            }
        }
        return -1;
    }
}
