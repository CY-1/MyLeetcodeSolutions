class Solution:
    def countSegments(self, s: str) -> int:
        if len(s)==0:
            return 0
        return len(s.split())
