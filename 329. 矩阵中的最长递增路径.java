class Solution {
    int[][] a;

    public int longestIncreasingPath(int[][] matrix) {
        int result=0;
        if(matrix.length==0 || matrix[0].length==0){
            return 0;
        }
        a=new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result=Math.max(my(matrix,i,j),result);
            }
        }
        return result;


    }
    public int my(int[][] matrix,int i,int j){

        if(a[i][j]!=0)
        {
            return a[i][j];
        }
        int result=0;//记录下一个节点的最长路径 然后加上当前的路径
        if(i<matrix.length-1){
            if(matrix[i+1][j]>matrix[i][j]){
                result=Math.max(my(matrix,i+1,j),result);
            }
        }
        if(j<matrix[0].length-1){
            if(matrix[i][j+1]>matrix[i][j]){
                result=Math.max(my(matrix,i,j+1),result);
            }
        }
        if(i>0){
            if(matrix[i-1][j]>matrix[i][j]){
                result=Math.max(my(matrix,i-1,j),result);
            }
        }
        if(j>0){
            if(matrix[i][j-1]>matrix[i][j]){
                result=Math.max(my(matrix,i,j-1),result);
            }
        }
        a[i][j]=result+1;

        return result+1;
    }
}
