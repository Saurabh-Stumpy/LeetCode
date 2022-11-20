class Solution {
    public int calculate(String s) {
        int cal = 0;
        int val = 0;
        int sign = 1;

        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                val = 0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    val = (val * 10) + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                cal = cal +(sign*val);
                sign = 1;
                val = 0;
            }
            else if(s.charAt(i)=='-'){
                sign = sign * -1;
            }
            else if(s.charAt(i)=='('){
                stack.push(cal);
                stack.push(sign);
                cal = 0;
                sign = 1;
            }
            else if (s.charAt(i)==')') {
                cal = cal * (Integer) stack.pop();
                cal+=(Integer) stack.pop();
            }
        }
        //System.out.println(cal);
        return cal;
    }
}