"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def levelOrder(self, root: 'Node') -> List[List[int]]:
        if not root:
            return []
        res = []
        d = collections.deque()
        d.append(root)
        while d:
            n = len(d)
            tmp = []
            for i in range(n):
                node = d.popleft()
                tmp.append(node.val)
                if node.children:
                    d.extend(node.children)
            res.append(tmp)
            
        return res

