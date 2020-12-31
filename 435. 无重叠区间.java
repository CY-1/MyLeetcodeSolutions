class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        int current=0;
        int count=0;
        while(current<intervals.length){
            if(current+1<intervals.length&&intervals[current+1][0]<intervals[current][1]){
                if(intervals[current][1]>=intervals[current+1][1]){
                    current++;
                }
                else{
                    intervals[current+1]=intervals[current];

                    current++;
                }
                count++;
            }
            else{
                current++;
            }
        }
        return count;
    }
}
