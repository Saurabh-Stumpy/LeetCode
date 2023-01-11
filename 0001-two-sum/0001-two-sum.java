class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int[] arr = new int[2];
        
        for(int i=0;i<nums.length;i++){
            if(h.containsKey(target-nums[i])){
                arr[1]=i;
                arr[0]=h.get(target-nums[i]);
                return arr;
            }
            h.put(nums[i],i);
        }
        return null;
    }
}