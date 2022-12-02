class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int prev=-200;

        for(int element:nums){
            if(prev!=element){
                prev = element;
                nums[count]=element;
                count++;
            }
        }

        return count;
    }
}