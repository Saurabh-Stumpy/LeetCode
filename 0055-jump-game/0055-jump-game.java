class Solution {
    public boolean canJump(int[] nums) {
        int count = nums[0];
        
        if(nums.length<=1){
            return true;
        }
        
        for(int i=1;i<nums.length;i++){
            if(count == 0)break;
            
            count--;
            count = Math.max(count,nums[i]);
            
            if((count+i)>=(nums.length-1)) return true;
        }
        return false;
    }
}