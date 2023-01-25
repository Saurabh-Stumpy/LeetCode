class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] arr = new int[2];
        if(nums.length<1){
            arr[0]=-1;
            arr[1]=-1;
            return arr;
        }
        arr[0] = searchStart(nums,target);
        if(arr[0]==-1){
            arr[1]=-1;
            return arr;
        }
        arr[1] = searchEnd(nums,target);

        return arr;
    }
    public static int searchStart(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int pos = -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                end = mid-1;
                pos = mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }

        return pos;
    }


    public static int searchEnd(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        int pos = -1;

        while (start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]==target){
                start = mid+1;
                pos = mid;
            }
            else if(nums[mid]>target){
                end = mid-1;
            } else if (nums[mid]<target) {
                start = mid+1;
            }
        }

        return pos;
    }
}