class Solution {
    public void rotate(int[][] matrix) {
        int[][] a=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++)
            {
                a[i][j]=matrix[i][j];
            }
        }
        for(int j=0;j<matrix.length;j++){
            for(int i=0;i<matrix.length;i++){
                matrix[i][j]=a[matrix.length-j-1][i];
            }
        }
    }
}
