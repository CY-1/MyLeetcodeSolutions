class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        import bisect
        if len(nums)==1:
            return nums[0]
        for i in range(len(nums)):
            if nums[i]!=nums[i-1] and i==bisect.bisect_right(nums,nums[i])-1:
                return nums[i]
