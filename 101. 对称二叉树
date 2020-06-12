# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        result1=[]
        result2=[]
        def my(flag,tree):
            if flag:
                if tree!=None:
                    result1.append(tree.val)
                    my(flag,tree.left)
                    my(flag,tree.right)
                else:
                    result1.append(None)
            else:
                if tree!=None:
                    result2.append(tree.val)
                    my(flag,tree.right)
                    my(flag,tree.left)
                else:
                    result2.append(None)
        if root==None or (root.left==None and root.right==None):
            return True
        if root.left!=None and root.right!=None:
            my(1,root.left)
            my(0,root.right)
            # print(result1, " ",result2)
            return result1==result2
        else:
            return False
# 检测遍历结果就可以了
