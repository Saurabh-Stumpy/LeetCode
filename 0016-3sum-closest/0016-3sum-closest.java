class Solution {
    public int threeSumClosest(int[] nums, int target) {
       Arrays.sort(nums);
        int value = Integer.MAX_VALUE;

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            while (start<end){
                if(Math.abs(nums[i]+nums[start]+nums[end]-target)<Math.abs(target-value)){
                    value = nums[i]+nums[start]+nums[end];
                }
                else if(nums[i]+nums[start]+nums[end]>target){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return value;
    }
}