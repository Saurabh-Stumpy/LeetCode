class Solution {
    public String longestPalindrome(String s) {
        int start =0;
        int end =0;
        int max = -1;

        for (int i=0;i<s.length();i++){
            int j = s.length()-1;
            if(max>j-i){
                break;
            }
            while (j>=i){
//                System.out.println(s.charAt(i)+" "+s.charAt(j));
                if(max>j-i){
                break;
            }
                if(s.charAt(i)==s.charAt(j)){
                    if(ifPalindrome(s,i,j)){
                        if(max<j-i){
                            start = i;
                            end = j;
                            max = j-i;
                            break;
                        }
                    }
                }
                j--;
            }
        }

        StringBuilder abc = new StringBuilder();
        for (int i=start;i<=end;i++){
            abc.append(s.charAt(i));
        }
        return abc.toString();
    }
    public static boolean ifPalindrome(String s, int start,int end){
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}