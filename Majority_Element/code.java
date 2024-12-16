class Solution {
    public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
        int s = 0, f = 0;
		for(int e : nums){
			map.put(e , map.getOrDefault(e, 0 ) +1 );
            if(map.get(e) > s){
                f = e;
                s = map.get(e);
            }
		}
        return f;	        
    }
}
