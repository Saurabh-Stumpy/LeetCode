class Solution {
    public boolean halvesAreAlike(String s) {
        String str = s.toUpperCase();
        int count = 0;
        
        
        for(int i=0;i<str.length();i++){
            if(i<str.length()-i){
                char ch = str.charAt(i);
                char ch1 = str.charAt(str.length()-i-1);
            
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    count++;
                }
                if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'){
                    count--;
                }
            }
            else break;
        }
        if(count == 0)return true;
        else return false;
    }
}