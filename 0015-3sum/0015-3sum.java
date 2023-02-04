class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> li = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int start = i+1;
            int end = nums.length-1;
            while (start<end){
                if(nums[i]+nums[start]+nums[end]==0){
                    List<Integer> ar = new ArrayList<>();
                    ar.add(nums[i]);
                    ar.add(nums[start]);
                    ar.add(nums[end]);
                    li.add(ar);
                    while (nums[start]==nums[start+1] && start<end-1){
                        start++;
                    }
                    while (nums[end]==nums[end-1] && start<end){
                        end--;
                    }
                    start++;
                    end--;
                }
                else if(nums[i]+nums[start]+nums[end]>0){
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return li;
    }
}