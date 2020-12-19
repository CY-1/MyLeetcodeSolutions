# 更简单的解法
class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        return int(min(len(set(candyType)),len(candyType)/2))
       
       
       
       
class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        a={}
        for i in candyType:
            a[i]=a.get(i,0)+1
        b=[]
        for i in a.keys():
            b.append([i,a.get(i)])
        b.sort(key=lambda x:x[1])
        i=0
        number=0
        length=len(candyType)
        result=[]
        #print(b)
        length_b=len(b)
        while number<length/2:
            if b[i][1]>0:
                b[i][1]-=1
                number+=1
                result.append(b[i][0])
                i+=1
                i=i%length_b
            else:
                i+=1
                i=i%length_b
        return len(set(result))
