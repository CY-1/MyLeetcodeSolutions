class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    // 尽可能找到一个current是负数的加油站的下一个加油站作为起点，因为要最大化远离是负数的加油站，这样才能在前面的行程中加足够多的油，在后面通过这个加油站
      int index = 0, count = 0, t = 0, len = gas.length;
      for(int i = 0; i < len; i++){
          int temp = gas[i] - cost[i];
          count += temp;
          t += temp;
          if(t < 0){
              index = i + 1;  
              t = 0;
          }

      }
      return count >= 0 ? index : -1;
  }

}

