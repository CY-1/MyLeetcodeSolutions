class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(r*c!=(nums.length)*(nums[0].length)){
            return nums;
        }
        int[][] a=new int[r][c];

        for(int i=0;i<(nums.length)*(nums[0].length);i++){
            a[i/(c)][i%(c)]=nums[i/(nums[0].length)][i%(nums[0].length)];
        }

        return a;
    }
}
