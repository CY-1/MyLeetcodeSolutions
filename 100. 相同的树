# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    import functools
    @functools.lru_cache(None)
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        def my(a,b):
            if a!=None:
                if b!=None and a.val==b.val:
                    return my(a.left,b.left) and my(a.right, b.right)

                else:
                    return False
            else:
                if b==None:
                    return True
        return my(p,q)==True
# 普通的递归写法 加上自带的装饰器
