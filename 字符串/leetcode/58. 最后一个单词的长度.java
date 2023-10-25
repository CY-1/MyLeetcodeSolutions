class Solution {
    public int lengthOfLastWord(String s) {
        //从后向前 遇到单词后 找到第一次出现的空格位置
        if(s.length()==1){
            return s.charAt(0)==' '?0:1; 
        }
        char[] chars = s.toCharArray();
        int flag=0;
        for(int i=s.length()-1;i>=0;i--){
            if(chars[i]!=' '){
                flag++;
            }
            else{
                if(flag!=0)return flag;
            }
        }
        return flag;
    }
}