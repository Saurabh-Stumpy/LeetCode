class Solution {
    public int lengthOfLongestSubstring(String s) {
        // if(s.length()==1){
        //     return 1;
        // }
        int count = 0;
        int start = 0;
        int i=0;
        Boolean[] bool = new Boolean[257];

        for(;i<s.length();i++){
            if(bool[s.charAt(i)]!=null && bool[s.charAt(i)]==true ){
                count = Math.max(count,i-start);
                //System.out.println(start+" "+i);
                while (s.charAt(start) != s.charAt(i)){
                    bool[s.charAt(start)] = false;
                    start++;
                }
                start++;
            }
            else{
                bool[s.charAt(i)] = true;
            }
        }
        count = Math.max(count,i-start);
        //System.out.println(Arrays.toString(bool));
        return count;
    }
}