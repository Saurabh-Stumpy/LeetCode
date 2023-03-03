class Solution {
    public int strStr(String haystack, String needle) {
        
        for(int i = 0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                Boolean flag = false;
                for(int j=0;j<needle.length();j++){
                    if(i+j>=haystack.length()) return -1;
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(flag == false) return i;
        }
    }
    return -1;
}
}