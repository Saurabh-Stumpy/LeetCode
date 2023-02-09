class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        
        if(nums.length<4) return arr;
        
        Arrays.sort(nums);
//        for(int a:nums){
//            System.out.print(a+" ");
//        }
//        System.out.println();
        for (int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for (int j=i+1;j<nums.length-2;j++){
                if(j-i>1 && nums[j]==nums[j-1]) continue;
                int start = j+1;
                int end = nums.length-1;
                while (start<end){
//                    System.out.println(nums[i]+" "+nums[j]+" "+nums[start]+" "+nums[end]+" "+(nums[start]+nums[end]+nums[j]+nums[i]));
                    if((long)nums[start]+nums[end]+nums[j]+nums[i]==target){
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[end]);
                        li.add(nums[start]);
                        li.add(nums[j]);
                        li.add(nums[i]);
                        arr.add(li);
                        do{
                            start++;
                        }while (nums[start]==nums[start-1]&& start<end);
                        do{
                            end--;
                        }while (nums[end]==nums[end+1] && end>start);
                    }
                    else if(nums[start]+nums[end]+nums[j]+nums[i]<target) start++;
                    else end--;
                }
            }

        }

        return arr;
    }
}