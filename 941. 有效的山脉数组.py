class Solution:
    def validMountainArray(self, A: List[int]) -> bool:
        A_length=len(A)
        if A_length<3:
            return False
        falg=1
        for i in range(1,A_length):
            if falg==1:
                if A[i]>A[i-1]:
                    continue
                else:
                    if i>1:
                        falg=-1
                    else:
                        return False
            if falg==-1:
                if A[i]<A[i-1]:
                    continue
                else:
                    return False
        return True if falg==-1 else False
