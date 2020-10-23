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
    int sum;
    public int pathSum(TreeNode root, int sum) {
            this.sum=sum;
            if(root==null){
                return 0;
            }
            if(root.right==null&&root.left==null){
                return root.val==sum?1:0;
            }
            my1(root);
            return result;
    }
    public void my1(TreeNode root){
        if(root==null){
            return;
        }
        else{
            my(root,root.val,1);
            my1(root.left);
            my1(root.right);
        }
    }
    public void my(TreeNode root, int current,int total){
        if(root==null){
            return;
        }
        if(current==this.sum&&total!=0){
            this.result++;
        }
        if(root.left!=null){
            my(root.left,current+root.left.val,total+1);

        }
        if(root.right!=null){
            my(root.right,current+root.right.val,total+1);
        }
    }
}
