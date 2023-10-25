class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if (strs.length == 0) {
            return sb.toString();
        }
        if (strs[0].length() == 0) {
            return sb.toString();
        }
        // 既然是公共前缀 那么以第一个str为样板即可
        for (int i = 0; i < strs[0].length(); i++) {
            sb.append(strs[0].charAt(i));
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() == i) {
                    sb.delete(sb.length() - 1, sb.length());
                    return sb.toString();
                } else if (strs[j].charAt(i) != sb.charAt(i)) {
                    sb.delete(sb.length() - 1, sb.length());
                    return sb.toString();
                }
            }
        }
        return sb.toString();
    }
}