# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getMinimumDifference(self, root: TreeNode) -> int:

        result=[]
        def my(node):
            result.append(node.val)
            if node.left!=None:
                my(node.left)
            if node.right!=None:
                my(node.right)

        my(root)
        result.sort()
        a=float('Inf')

        for i in range(1,len(result)):
            a=min(a,result[i]-result[i-1])
        return a

    
    
    # Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def getMinimumDifference(self, root: TreeNode) -> int:

        result=[]
        stack=[root]
        while stack:
            a=stack.pop()
            result.append(a.val)
            if a.left!=None: stack.append(a.left)
            if a.right!=None: stack.append(a.right)


        result.sort()
        a=float('Inf')

        for i in range(1,len(result)):
            a=min(a,result[i]-result[i-1])
        return a
