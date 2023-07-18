class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        result=[]
        nums_length=len(nums)
        remeber={}
        for i in range(nums_length-3):
            if i>0 and nums[i]==nums[i-1]:
                continue
            if nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target:
                break
            if nums[i] + nums[nums_length - 3] + nums[nums_length - 2] + nums[nums_length - 1] < target:
                continue

            for j in range(i+1,nums_length-2):
                if j-i>1 and nums[j]==nums[j-1]:
                    continue
                if nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target:
                    break
                if nums[i] + nums[j] + nums[nums_length - 2] + nums[nums_length - 1] < target:
                    continue
                l=j+1
                r=nums_length-1
                while r>l:
                    if nums[i]+nums[j]+nums[l]+nums[r]==target:
                        if remeber.get((nums[i],nums[j],nums[l],nums[r]),0)!=1:
                            result.append([nums[i],nums[j],nums[l],nums[r]])
                            remeber[(nums[i],nums[j],nums[l],nums[r])]=1
                        l+=1
                        r-=1
                    elif nums[i]+nums[j]+nums[l]+nums[r]>target:
                        r-=1
                    else:
                        l+=1
        return result
