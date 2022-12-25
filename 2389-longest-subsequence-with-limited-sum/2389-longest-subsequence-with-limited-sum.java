class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[] arr = new int[queries.length];
        int j=0;
        for(int element:queries){
            int sum = 0;
            int count = 0;
            for(int i=0;i<nums.length;i++){
                if(sum+nums[i]<=element){
                    sum+=nums[i];
                    count++;
                }
                else break;
            }
            arr[j]=count;
            j++;
        }
        
        return arr;
    }
}