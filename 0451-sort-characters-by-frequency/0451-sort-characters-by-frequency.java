class Solution {
    public String frequencySort(String s) {
        int[] arr = new int[123];

        for(int i=0;i<s.length();i++){
                arr[s.charAt(i)]++;
        }

        Pair[] p = new Pair[123];

        for(int i=0;i<arr.length;i++){
            p[i] = new Pair(arr[i],(char) (i));
        }
//        for (Pair pair : p) {
//            System.out.print(pair.ch + "" + pair.feq+" ");
//        }
        Arrays.sort(p);
//        System.out.println();
//        for (Pair pair : p) {
//            System.out.print(pair.ch + "" + pair.feq+" ");
//        }
        StringBuilder str = new StringBuilder();
        for (Pair pair : p) {
            for(int i=0;i<pair.feq;i++){
                str.append(pair.ch);
            }
        }

        return str.toString();
        
    }
}
class Pair implements Comparable<Pair>{
        public int feq;
        public char ch;

        Pair(int feq,char ch){
            this.feq=feq;
            this.ch=ch;
        }

        @Override
        public int compareTo(Pair o) {
            return o.feq - this.feq;
        }
    }