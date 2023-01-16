class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sol = new int[nums1.length];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                sol[k] = nums1[i];
                i++;
                k++;
            }
            else{
                sol[k] = nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            sol[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            sol[k]=nums2[j];
            j++;
            k++;
        }
        for(i=0;i<sol.length;i++){
            nums1[i]=sol[i];
        }
    }
}