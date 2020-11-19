from typing import List


class Solution:
    def findRadius(self, houses: List[int], heaters: List[int]) -> int:

        """存放每个房屋与加热器的最短距离"""
        res = []
        heaters.sort()
        for c in houses:
            """二分查找"""
            left = 0
            right = len(heaters) - 1
            while left < right:
                mid = (left + right) >> 1
                if heaters[mid] < c:
                    left = mid + 1
                else:
                    right = mid
            """得出的 left 所指的加热器并不一定是离房屋 c 最近的一个，需要判断以下情况"""
            if heaters[left] == c:
                """若找到的值等于 c ，则说明 c 房屋处放有一个加热器，c 房屋到加热器的最短距离为 0"""
                res.append(0)

            elif heaters[left] < c:
                """若该加热器的坐标值小于 c ，说明该加热器的坐标与 c 之间没有别的加热器"""
                res.append(c - heaters[left])

            elif left == 0:
                """
                若left == 0 即二分查找的结果指向第一个加热器的坐标,说明 heaters[left] 坐标的房屋之前的位置
                未放置加热器,直接相减就是到房屋 c 最近加热器的距离
                """
                res.append(heaters[left] - c)
                
            else:
                """
                若left不等于 0 ，说明 c 介于left和left-1之间，房屋到加热器的最短距离就是left和left - 1处
                加热器与 c 差值的最小值.
                """
                res.append(min(heaters[left] - c, c - heaters[left - 1]))
                
        return max(res)


