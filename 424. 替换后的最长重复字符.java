class Solution {
    private int[] map = new int[26];

    public int characterReplacement(String s, int k) {
        if (s == null) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        int historyCharMax = 0;
        for (right = 0; right < chars.length; right++) {
            int index = chars[right] - 'A';
            map[index]++;
            historyCharMax = Math.max(historyCharMax, map[index]);
            if (right - left + 1 > historyCharMax + k) {
                map[chars[left] - 'A']--;
                left++;
            }
        }
        return chars.length - left;
    }
}

作者：migoo
链接：https://leetcode-cn.com/problems/longest-repeating-character-replacement/solution/tong-guo-ci-ti-liao-jie-yi-xia-shi-yao-shi-hua-don/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
