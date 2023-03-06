class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int i = 0;
        int count2 = 1;
        
        while(count<k && i<arr.length){
            if(arr[i]==count2){
                i++;
                count2++;
            }
            else{
                count2++;
                count++;
            }
        }
        while(count<k){
            count++;
            count2++;
        }
        return count2-1;
    }
}