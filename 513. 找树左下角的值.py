# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def findBottomLeftValue(self, root: TreeNode) -> int:
        self.a=(-1,-1)
        def my(root,depth):
            if root==None:
                return;
            if root.left==None and root.right==None and depth>self.a[1]:
                self.a=(root.val,depth)  
            my(root.left,depth+1)
            my(root.right,depth+1)
        my(root,0)
        return self.a[0]
            
