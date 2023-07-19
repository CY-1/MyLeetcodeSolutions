package 双指针.LeetCode;

import java.util.Arrays;


class Solution {
    public static void main(String[] args) {
        new Solution().sortedSquares(new int[]{-4,-1,0,3,10})
    }
    public int[] sortedSquares(int[] A) {
        int left = 0, right = A.length-1;
        int[] result = new int[A.length];
        int index=result.length-1;
        while (left <= right) {
            if (Math.abs(A[left]) < Math.abs(A[right])) {
                result[index--] = A[left] * A[left];
                left++;
            }
            else {
                result[index--] = A[right] * A[right];
                right--;
            }
        }
        return result;
    }
}
