class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        long sum2= 0;
        long minsum = Long.MAX_VALUE;
        int index = 0;
        for(int element:nums) {
        	sum+=element;
        }
        for(int i=0;i<nums.length;i++) {
        	sum2+=nums[i];
        	sum-=nums[i];
        	if((nums.length-i-1)!=0) {
        		long cal = Math.abs((sum2/(i+1))-(sum/(nums.length-i-1)));
        		if(cal<minsum) {
        			minsum = cal;
        			index = i;
        		}
        	}
        	else {
        		long cal = Math.abs(sum2/nums.length);
        		if(cal<minsum) {
        			minsum = cal;
        			index = i;
        		}
        	}
        }
        
        return index;
    }
}