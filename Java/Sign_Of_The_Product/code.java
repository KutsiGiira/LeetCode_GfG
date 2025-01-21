class Solution {
    public int arraySign(int[] nums) {
        int s = 0;
        for(int e : nums){
            if(e == 0){
                return 0;
            }
            else if(e <= -1){
                s++;
            }
        }
        if(s % 2 == 0){
            return 1;
        }
        return -1;
    }
}
