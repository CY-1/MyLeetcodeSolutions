# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def insertIntoBST(self, root: TreeNode, val: int) -> TreeNode:
        a=root
        if not root:
            return TreeNode(val)
        while True:
            if a.val>val:
                if a.left==None:
                    a.left=TreeNode(val)
                    return root
                a=a.left
            else:
                if a.right==None:
                    a.right=TreeNode(val)
                    return root
                a=a.right
            
        return root
