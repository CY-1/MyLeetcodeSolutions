class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0){
            return res;
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(dfsPacific(matrix,i,j,Long.MAX_VALUE) 
                        && dfsAtlantic(matrix,i,j,Long.MAX_VALUE)){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    //“太平洋”处于大陆的左边界和上边界
    private boolean dfsPacific(int[][] matrix, int i, int j, long prev){
        if(i > matrix.length-1 || j > matrix[0].length-1 || matrix[i][j] == -1 || matrix[i][j] > prev){
            return false;
        }
        //到了太平洋的边界，说明可以流入，返回true
        if(i <= 0 || j <= 0){
            return true;
        }
        //temp临时记录当前matrix[i][j]的值，返回重复遍历
        int temp = matrix[i][j];
        matrix[i][j] = -1;
        boolean result = dfsPacific(matrix,i-1,j,temp)
                || dfsPacific(matrix,i+1,j,temp)
                || dfsPacific(matrix,i,j-1,temp)
                || dfsPacific(matrix,i,j+1,temp);
        matrix[i][j] = temp;
        return result;
    }

    //“大西洋”处于大陆的右边界和下边界
    private boolean dfsAtlantic(int[][] matrix, int i, int j, long prev){
        if(i < 0 || j < 0 || matrix[i][j] == -1 ||  matrix[i][j] > prev){
            return false;
        }
        //到了大西洋的边界，说明可以流入，返回true
        if(i >= matrix.length-1 || j >= matrix[0].length-1){
            return true;
        }
        //temp临时记录当前matrix[i][j]的值，返回重复遍历
        int temp = matrix[i][j];
        matrix[i][j] = -1;
        boolean result = dfsAtlantic(matrix,i-1,j,temp)
                || dfsAtlantic(matrix,i+1,j,temp)
                || dfsAtlantic(matrix,i,j-1,temp)
                || dfsAtlantic(matrix,i,j+1,temp);
        matrix[i][j] = temp;
        return result;
    }
}

