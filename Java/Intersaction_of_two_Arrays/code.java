class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> tempArr = new HashSet<>();
        HashSet<Integer> dup = new HashSet<>();
        ArrayList<Integer> resArr = new ArrayList<>();
        for(int e : nums1){
            dup.add(e);
            }
        for(int e : nums2){
            if(dup.contains(e)){
                tempArr.add(e);
            }
        }
        for(Integer e : tempArr){
            resArr.add(e);
        }
        int[] res = new int[resArr.size()];
        for(int i = 0 ; i < resArr.size() ; i++){
            res[i] = resArr.get(i);
        }
        return res;
    }
}
