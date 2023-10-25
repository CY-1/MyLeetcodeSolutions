class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        // 先按照每行能放的单词分组
        List<String> list = new ArrayList<String>();
        StringBuffer sb = new StringBuffer(words[0]);
        for (int i = 1; i < words.length; i++) {
            if (sb.length() + 1 + words[i].length() <= maxWidth) {
                sb.append(" ");
                sb.append(words[i]);
            } else {
                list.add(sb.toString());
                sb = new StringBuffer(words[i]);
            }
        }
        if (sb.length() != 0)
            list.add(sb.toString());
        // 给每行添加空格
        int count = 0;// 平均放的空格
        int more = 0;// 不足平均左边应该多出来的空格
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < list.size() - 1; i++) {
            sb = new StringBuffer();
            String[] s = list.get(i).split(" ");
            if (s.length == 1) {

                sb.append(s[0]);
                add(sb, maxWidth - s[0].length());
                result.add(sb.toString());
            } else {
                count = (maxWidth - list.get(i).length() + s.length - 1) / (s.length - 1);
                more = maxWidth - count * (s.length - 1) - list.get(i).length() + (s.length - 1);

                for (int j = 0; j < s.length - 1; j++) {
                    sb.append(s[j]);
                    // 放空格 如果more大于0 代表不能均分 并且当前位置应该多放1个
                    add(sb, count + (more > 0 ? 1 : 0));
                    more--;
                }
                sb.append(s[s.length - 1]);
                result.add(sb.toString());
            }
        }

        // 最后一行特殊处理
        String[] s = list.get(list.size() - 1).split(" ");
        sb = new StringBuffer(s[0]);
        for (int i = 1; i < s.length; i++) {
            sb.append(" ");
            sb.append(s[i]);
        }
        add(sb, maxWidth - sb.length());
        result.add(sb.toString());
        return result;
    }

    void add(StringBuffer sb, int num) {
        for (int i = 0; i < num; i++) {
            sb.append(" ");
        }
    }
}