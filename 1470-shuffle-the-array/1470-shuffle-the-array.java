class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int j=0;
        for(int i=0;i<n;i++){
            arr[j]=nums[i];
            j++;
            arr[j]=nums[i+n];
            j++;
        }
        
        return arr;
    }
}