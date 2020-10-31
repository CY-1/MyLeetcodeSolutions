class Solution:
    def compress(self, chars) -> int:
        i=0
        while i<len(chars):
            d=1
            for j in range(i+1,len(chars)):
                if chars[j]==chars[i]:
                    d+=1
                else:
                    break
            if d>1:
                del chars[i+1:i+d]

                for x in str(d)[::-1]:
                    chars.insert(i+1,x)
                d="12"

            i+=len(str(d))
        return len(chars)
