package 字符串.leetcode;
/*
 * @lc app=leetcode.cn id=539 lang=java
 *
 * [539] 最小时间差
 */

// @lc code=start
class Solution {

    public int findMinDifference(List<String> timePoints) {
        //转化为int并排序
        List<List<Integer>> timeList=new ArrayList<List<Integer>>();
        timePoints.forEach((String timePoint) ->{
            List<Integer> list=new ArrayList<>();
            list.add(Integer.parseInt(timePoint.substring(0,2)));
            list.add(Integer.parseInt(timePoint.substring(3,5)));
            timeList.add(list);
        });
        timeList.sort((a,b)->{
            if(a.get(0)!=b.get(0))
                return a.get(0)-b.get(0);
            else{
                return a.get(1)-b.get(1);
            }
        });
//      比较前后两个时间点的时间间隔
        int result=Integer.MAX_VALUE;
        int current=0;
        for (int i = 1; i < timeList.size(); i++) {
            current = diff(timeList.get(i - 1), timeList.get(i));
            result = result > current ? current : result;
        }
//      除了相邻的两个时间点 那就是最后一个和第一个的时间点可能最短
current = diff(Arrays.asList(0, 0), timeList.get(0)) + diff(timeList.get(timeList.size() - 1), Arrays.asList(24, 0));
        result=result>current?current:result;
        return result;

    }

    public int diff(List<Integer> t1, List<Integer> t2) {
        //比较差了几个小时
        int result=60*(t2.get(0)-t1.get(0));
        if (t2.get(1) < t1.get(1)) {
            //如果不满一个小时就见一 比如 2:01 和1:50 不满一个小时
            result -= 60;
            //再计算分钟数
            return result + 60 - t1.get(1) + t2.get(1);
        }
        //计算满一个小时的情况下计算分钟数
        result+=Math.abs(t1.get(1)-t2.get(1));
        return result;
    }
}
// @lc code=end

