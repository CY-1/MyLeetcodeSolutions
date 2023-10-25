package 字符串.leetcode;

class Solution {
    public String reverseWords(String s) {
        //API调用处理
        s = s.trim();
        String[] s1 = s.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=s1.length-1;i>=0;i--){
            if(s1[i].length()>0)
            {
                sb.append(s1[i]);
                sb.append(" ");
            }
        }
        sb.delete(sb.length()-1,sb.length());
        return sb.toString();
    }
}