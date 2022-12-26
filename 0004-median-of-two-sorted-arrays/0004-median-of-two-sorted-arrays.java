class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length) {
            return median(nums1,nums2);
        }
        else {
            return median(nums2, nums1);
        }
    }
    
    public static double median(int[] a1,int[] a2){

        int start = 0;
        int end = a1.length;
        int n1 = a1.length;
        int n2 = a2.length;
        while(start<=end){
            int mid1 = (start+end)/2;
            int mid2 = (n1+n2+1)/2-mid1;

            int l1=mid1 == 0?Integer.MIN_VALUE:a1[mid1-1];
            int l2=mid2 == 0?Integer.MIN_VALUE:a2[mid2-1];
            int r1=mid1 == n1?Integer.MAX_VALUE:a1[mid1];
            int r2=mid2 == n2?Integer.MAX_VALUE:a2[mid2];

            if(l1<=r2 && l2<=r1){
                //System.out.println(mid1+" "+mid2);
                if((n1+n2)%2==0){
                    //System.out.println(l1+" "+l2+" "+r1+" "+r2);
                    return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
                }
                else return (double) Math.max(l1,l2);
            }
            else if(l1>r2) end = mid1-1;
            else start = mid1+1;
        }

        return -1;
    }
}