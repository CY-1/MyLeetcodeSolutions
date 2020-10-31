class Solution:
    def toHex(self, num: int) -> str:
        stra = ''
        if num < 0:
            num = (abs(num) ^ ((2 ** 32) - 1)) + 1
        elif num == 0:
            return '0'
        while (num >> 4) > 0 or num > 0:
            a = str(num % 16)
            if a == '10': a = 'a'
            elif a == '11': a = 'b'
            elif a == '12': a = 'c'
            elif a == '13': a = 'd'
            elif a == '14': a = 'e'
            elif a == '15': a = 'f'
            stra += a
            num = num >> 4
        return ''.join(reversed(stra))




        
        



作者：SHENSHIN
链接：https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/solution/fen-hao-luo-ji-dui-fu-shu-0-zheng-shu-fen-bie-chu-/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
