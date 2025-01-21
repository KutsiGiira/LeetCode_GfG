var search = function(nums, target) {
    var low = 0;
    var high = nums.length - 1;
    while(low <= high){
        var m = low + high/2;
        if(nums[m] === target){
            return 1;
        }
        else if(target > nums[m]){
            low = m + 1;
        }
        else{
            high = m - 1;
        }
    }
    return -1;
};
