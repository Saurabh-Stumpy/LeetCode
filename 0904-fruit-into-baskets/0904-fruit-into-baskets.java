class Solution {
    public int totalFruit(int[] fruits) {
        int max = 1;

        if(fruits.length<2){
            return fruits.length;
        }

        for (int i = 0;i<fruits.length-1;i++){
            if(i>0 && fruits[i]==fruits[i-1]) continue;
            int j = i;
            while (j<fruits.length && fruits[i]==fruits[j]){
                j++;
            }
            int k=j;
            while (k<fruits.length){
                if(fruits[k]==fruits[i]||fruits[k]==fruits[j]){
                    k++;
                }
                else break;
            }
//            System.out.println(i+" "+j+" "+k);
            max = Math.max(k-i,max);
//            System.out.println(max);
        }

        return max;
    }
}