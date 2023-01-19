class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int max = 0;
        boolean flag = true;
        
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            max = Math.max(max,nums[i]);
            if(nums[i]==0){
                flag = false;
            }
        }
        if(flag){
            return 0;
        }
        int sum1 = max*(max+1)/2;
        System.out.println(sum1);
        if(sum1==sum){
            return max+1;
        }
        else{
            return sum1-sum;
        }
    }
}