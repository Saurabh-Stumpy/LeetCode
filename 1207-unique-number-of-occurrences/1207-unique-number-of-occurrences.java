class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int uarr[] = new int[2001];
        
        for(int element:arr){
            uarr[element+1000]++;
        }
        Arrays.sort(uarr);
        
        for(int i=0;i<2000;i++){
            if(uarr[i]>0){
                if(uarr[i]==uarr[i+1]) return false;
            }
        }
        return true;
    }
}