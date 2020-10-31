# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def sumOfLeftLeaves(self, root: TreeNode) -> int:
        self.result=0
        def my(root):
            if root==None:
                return
            else:

                self.result=self.result+root.left.val if root.left!=None and root.left.left==None and root.left.right==None else self.result
                my(root.left)

                my(root.right)
        my(root)
        return self.result
