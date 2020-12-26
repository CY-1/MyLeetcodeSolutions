class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length()==0||word2.length()==0)return Math.max(word1.length(),word2.length());
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++)
            {
                if(word1.charAt(i)==word2.charAt(j)){

                    dp[i][j]=(i>0&&j>0?dp[i-1][j-1]:0)+1;
                }
                else{
                    dp[i][j]=Math.max(i>0?dp[i-1][j]:0,j>0?dp[i][j-1]:0);
                }
            }
        }
        return word1.length()-dp[word1.length()-1][word2.length()-1]+word2.length()-dp[word1.length()-1][word2.length()-1];
    }
}
