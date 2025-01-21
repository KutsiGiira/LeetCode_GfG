class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0,j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        while(j < nums2.length && i < nums1.length){
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                j++;
                i++;
            }
            else if(nums1[i] < nums2[j]){
                i++;
            }
            else{
                j++;
            }
    }
        int[] arr = new int[list.size()];
        for(int d = 0 ; d < list.size() ; d++){
            arr[d] = list.get(d);
    }
        return arr;
    }
}
