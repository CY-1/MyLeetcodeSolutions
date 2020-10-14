class Solution:
    def commonChars(self, A: List[str]) -> List[str]:
        a={}
        total=float('inf')
        result=[]
        for i in set(A[0]):
            total=A[0].count(i)
            for j in A[1:]:
                total=min(total,j.count(i))
            while total!=0:
                result.append(i)
                total-=1
        return result
