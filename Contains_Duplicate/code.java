class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> m = new HashSet<>();
        for(int e : nums){
            m.add(e);
        }
        if(m.size() == nums.length){
            return false;
        }
        return true;

    }
}
