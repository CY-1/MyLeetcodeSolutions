# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def mirrorTree(self, root: TreeNode) -> TreeNode:
        def my(root):
            if root==None:
                return None;
            else:
                root.left,root.right=root.right,root.left
                my(root.left)
                my(root.right)
        my(root)
        return root;
