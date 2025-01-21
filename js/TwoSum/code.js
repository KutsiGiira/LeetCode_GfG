/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    for(let i = 0 ; i < nums.length ; i++){
        for(let d = 1 ; d < nums.length ; d++){
            if(nums[i] + nums[d] == target){
                return [i,d];
            }
        }
    }
};
