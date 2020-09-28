class Solution:
    def maxRotateFunction(self, A: List[int]) -> int:
        n = len(A)
        cur = sum(A[i] * i for i in range(n))
        _sum = sum(A)
        res = cur
        for i in range(1, n):
            cur = _sum - n * A[-i] + cur
            res = max(res, cur)
        return res
