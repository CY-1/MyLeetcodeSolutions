class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int ans = 0;
        // 以 \n 分割成字符串数组
        String[] str = input.split("\n");
        // dir,\tsubdir1,\tsubdir2,\tfile.ext
        for (String s : str) {
            // level 代表当前字符串的首字母索引
            // 字符串前面可能会有多个 \t,故使用 lastIndexOf 找出最后一个 \t 位置即可
            int level = s.lastIndexOf("\t") + 1;
            while (level + 1 < stack.size()) {
                stack.pop();
            }
            // 之前入栈的字符串 + 当前遍历到的字符串的长度
            int len = stack.peek() + (s.length() - level + 1);
            stack.push(len);
            if (s.contains(".")) {
                ans = Math.max(ans, len - 1);
            }
        }
        return ans;
    }
}


# 链接：https://leetcode-cn.com/problems/longest-absolute-file-path/solution/388-wen-jian-de-zui-chang-jue-dui-lu-jing-zi-fu-ch/
