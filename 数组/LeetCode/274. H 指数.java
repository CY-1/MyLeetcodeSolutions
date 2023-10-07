class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);//先排序
        for (int i = citations.length; i > 0; i--) {
            //如果H指数为i 那么要有i本书的引用大于i 那么 citations.length-i位置上的i应该大于等于i
            if(citations.length-i>=0&&citations[citations.length-i]>=i){
                return i;
            }
        }
        return 0;
    }
}