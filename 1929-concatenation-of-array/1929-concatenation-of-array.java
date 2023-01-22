class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int[] arr = new int[(nums.length*2)];
        
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
            arr[len+i]=nums[i];
        }
        
        return arr;
    }
}