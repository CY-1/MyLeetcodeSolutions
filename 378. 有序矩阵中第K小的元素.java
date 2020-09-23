class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++)
            {
                a.add(matrix[i][j]);
            }
        }
        Collections.sort(a);
        return a.get(k-1);
    }
    
}
