class Solution {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=Math.abs(A[i])*Math.abs(A[i]);
        }
        Arrays.sort(A);
        return A;
    }
}
