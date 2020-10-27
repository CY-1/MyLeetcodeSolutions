class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s)<=1:
            return len(s)
        s_set=set(list(s))
        s_number=[s.count(i) for i in s_set]
        result=0
        # print(s_set)
        # print(s_number)
        for i in s_number:
            if i>=2:
                result+=(i//2)*2
        if result<len(s):
            result+=1
        return result
        
