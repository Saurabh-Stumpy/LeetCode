class Solution {
    public int jump(int[] nums) {
         int jump = 0;
        if(nums.length<2){
            return 0;
        }

        for(int i = 0;i<nums.length;){
            //System.out.println("Pos of i :"+i);
            if(nums[i]+i>=nums.length-1){
                return jump+1;
            }
            int j =i+1;
            int max = i+1;
            while (j<nums.length&&j<=i+nums[i]){
                if(j+nums[j]>max+nums[max]){
                    max = j;
                }
                j++;
            }
            jump++;
            i = max;
        }
        return jump;
    }
}