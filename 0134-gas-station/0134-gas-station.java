class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        
        int[] diffGas = new int[gas.length];
        int sum = 0;
        for(int i=0;i<gas.length;i++){
            diffGas[i]=gas[i]-cost[i];
            sum+=diffGas[i];
        }
        
        if(sum>=0){
            int index = 0;
            int left = 0;
            for(int i=0;i<diffGas.length;i++){
                left+=diffGas[i];
                if(left<0){
                    left = 0;
                    index = i+1;
                }
            }
                return index;
        }
        else{
            return -1;
        }
        
    }
}