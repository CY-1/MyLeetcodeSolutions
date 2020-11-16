# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def levelOrder(self, root: TreeNode) -> List[int]:
        a=[]
        def my(root,depth):
            if root==None:
                return
            if depth>=len(a):
                a.append([])
            a[depth].append(root.val)
            my(root.left,depth+1)
            my(root.right,depth+1)
        my(root,0)
        result=[]
        for i in a:
            result.extend(i)
        return result
