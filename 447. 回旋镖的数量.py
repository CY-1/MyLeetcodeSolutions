class Solution:
    def numberOfBoomerangs(self, points: List[List[int]]) -> int:
        res = 0
        point_num = len(points)
        for i in range(point_num):
            hashmap = {}
            for j in range(point_num):
                if i==j: continue
                num = (points[i][0] - points[j][0])**2 + (points[i][1] - points[j][1])**2
                hashmap[num] = hashmap[num] + 1 if num in hashmap else 1
            for key in hashmap:
                res += hashmap[key] * (hashmap[key] - 1)
        return res
