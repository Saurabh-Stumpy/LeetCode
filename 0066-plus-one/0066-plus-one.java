class Solution {
    public int[] plusOne(int[] digits) {
        int nums = 0;
        int carry = 0;
        digits[digits.length-1]+=1;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = digits.length-1;i>=0;i--){
            digits[i]=digits[i]+carry;
            carry = 0;
            if(digits[i]>9){
                carry = 1;
            }
            arr.add(digits[i] %10);
        }
        if(carry==1){
            arr.add(1);
        }
        
        int[] sol = new int[arr.size()];
        int j=sol.length-1;
        for(int i:arr){
            //System.out.println(i);
            sol[j]=i;
            j--;
        }
        return sol;
        
    }
}