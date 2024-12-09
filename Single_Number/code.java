class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> list = new HashMap<>();
        for(int e : nums){
            list.put(e, list.getOrDefault(e, 0) + 1);
        }
        for(Integer d : list.keySet()){
            if(list.get(d) == 1){
                return d;
            }
        }
        return list.size();
    }
}
