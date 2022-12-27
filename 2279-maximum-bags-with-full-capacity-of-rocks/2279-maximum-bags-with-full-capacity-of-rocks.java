class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int i =0;
       for( i=0;i<capacity.length;i++){
            capacity[i]=capacity[i]-rocks[i];
        }
        int count =0;
        Arrays.sort(capacity);
        for( i=0;i<capacity.length;i++){
            if(additionalRocks>=capacity[i]){
                additionalRocks-=capacity[i];
                count++;
            }
            else break;
        }
        return count;
    }
}