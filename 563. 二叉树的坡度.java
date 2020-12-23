/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int result=0;
    public int findTilt(TreeNode root) {
        my(root);
        return result;
    }
    public int my(TreeNode a){
        if(a==null){
            return 0;
        }
        int left=my(a.left);
        int right=my(a.right);
        result+=Math.abs(left-right);
        return left+right+a.val;
    }
}
