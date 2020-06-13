# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        max_deepth=0
        def my(deepth,tree):
            if tree!=None:
                my(deepth+1, tree.left)
                my(deepth+1, tree.right)
            else:
                nonlocal max_deepth
                max_deepth=max(max_deepth,deepth-1)
        my(1,root)
        return max_deepth
# 和前面两道题过程差不多 求的东西不一样而已
