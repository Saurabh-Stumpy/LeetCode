class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        
        for(int a:nums){
            if(a==1){
                count++;
            }
            else{
                maxCount = Math.max(maxCount,count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount,count);
        return maxCount;
    }
}