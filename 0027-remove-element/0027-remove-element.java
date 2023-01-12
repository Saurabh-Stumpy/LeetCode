class Solution {
    public int removeElement(int[] nums, int val) {
        int j=-1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                j++;
                swap(nums,i,j);
            }
        }
        return j+1;
    }
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}