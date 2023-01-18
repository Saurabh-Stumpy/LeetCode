class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        
        for(int i:nums){
            if(!h.contains(i)){
                h.add(i);
            }
            else{
                return true;
            }
        }
        return false;
    }
}