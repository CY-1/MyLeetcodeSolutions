class Solution:
    def minDistance(self, word1: str, word2: str) -> int:
        n=len(word1)
        m=len(word2)
        D=[[0]*(m+1) for _ in range(n+1)]
        if n*m==0:
            return max(n,m)
        for i in range(m+1):
            D[0][i]=i
        for i in range(n+1):
            D[i][0]=i
        # 我们用 D[i][j] 表示 A 的前 i 个字母和 B 的前 j 个字母之间的编辑距离。
        for i in range(1,n+1):
            for j in range(1,m+1):
                # 下面当做 删除一个a字符 替换一个字符 增加一个字符 三种方法 只需取最小值
                a=D[i-1][j]+1
                b=D[i][j-1]+1
                c=D[i-1][j-1]
                if word1[i-1]==word2[j-1]:
                    # 因为末尾字符相等 不需要操作
                    D[i][j]=min(a,b,c)
                else:
                    # 字符不等需要1步
                    D[i][j]=min(a,b,c+1)
        return D[i][j]
# 动态规划解此题
# 为了使俩字符串A，B相等，有三种步骤 1.删除A中一个字符（删除B中也一样） 2.替换一个字符 3 增加一个字符
# 那么拆分问题 比如“ab”到字符串"a” 需要number步。那么“ab”到“ac”只需要number+1步
# 一直拆分问题直到一个字符串为空，那么步骤数就是len（另一个字符）
