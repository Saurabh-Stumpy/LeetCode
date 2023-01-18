class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        
        for(int i:nums){
            if(h.contains(i)){
                return true;
            }
            else{
                h.add(i);
            }
        }
        return false;
    }
}