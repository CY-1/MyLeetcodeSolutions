class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] res = new int[intervals.length];
        Map<int[], Integer> hash = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            hash.put(intervals[i], i);
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < intervals.length; i++) {
            int min = Integer.MAX_VALUE;
            int minindex = -1;
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] >= intervals[i][1] && intervals[j][0] < min) {
                    min = intervals[j][0];
                    minindex = hash.get(intervals[j]);
                }
            }
            res[hash.get(intervals[i])] = minindex;
        }
        return res;
    }
}

//作者：LeetCode
//链接：https://leetcode-cn.com/problems/find-right-interval/solution/xun-zhao-you-qu-jian-by-leetcode/
//来源：力扣（LeetCode）
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int[] result=new int[intervals.length];
        int current;
        for(int i=0;i<intervals.length;i++){
            current=-1;
            for(int j=0;j<intervals.length;j++){
                if(i!=j){
                    if(intervals[j][0]>=intervals[i][1]){
                        current= (current!=-1) ? intervals[j][0]>intervals[current][0]?current:j;
                    }
                }
            }
            result[i]=current;
        }
        return result;
    }
}
