class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();
        int[] ch = new int[26];

        if(p.length()>s.length()){
            return li;
        }
        int count = 0;
        int count2 =0;
        for(int i=0;i<p.length();i++){
            count+=p.charAt(i)-'a';
            ch[p.charAt(i)-'a']++;
        }

        for(int i=0;i<p.length();i++){
            count2 += s.charAt(i)-'a';
        }
        int i=0;
        int j=p.length()-1;

        while (j<s.length()-1){
            if(count2==count){
                int flag = 0;
                int[] testch = ch.clone();
                for(int a=i;a<j;a++){
                    if(testch[s.charAt(a)-'a']>0){
                        testch[s.charAt(a)-'a']--;
                    }
                    else{
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0) li.add(i);
            }
            count2 = count2 -(s.charAt(i)-'a');
            i++;
            j++;
            count2 = count2 +(s.charAt(j)-'a');
        }
        if(count2==count){
            int flag = 0;
            int[] testch = ch.clone();
            for(int a=i;a<j;a++){
                if(testch[s.charAt(a)-'a']>0){
                    testch[s.charAt(a)-'a']--;
                }
                else{
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) li.add(i);
        }

        return li;
    }
}