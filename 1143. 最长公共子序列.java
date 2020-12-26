class Solution {
    public int longestCommonSubsequence(String word1, String word2) {
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
        return dp[word1.length()-1][word2.length()-1];
    }
}
