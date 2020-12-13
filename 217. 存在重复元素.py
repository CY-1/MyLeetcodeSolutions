class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        result={}
        for i in nums:
            if result.get(i, True):
                result[i]=False
            else:
                return True
        return False
