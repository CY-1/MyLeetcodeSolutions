class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0;i<gas.length;i++){
            int j=i;
            int current=gas[i];
            while(true){
                if(current>=cost[j]){
                    current=current-cost[j];
                    j=(j+1)%gas.length;
                    current+=gas[j];
                }
                else{
                    break;
                }
                if(j==i){
                    return i;
                }
            }
        }
        return -1;
    }
}
