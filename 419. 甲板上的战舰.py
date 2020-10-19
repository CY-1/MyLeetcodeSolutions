class Solution:
    def countBattleships(self, board: List[List[str]]) -> int:
        row = len(board)
        col = len(board[0])
        res =  0
        for i in range(row):
            for j in range(col):
                if board[i][j] == ".": continue
                if i > 0 and board[i - 1][j] == "X": continue
                if j > 0 and board[i][j - 1] == "X": continue
                res += 1
        return res

作者：powcai
链接：https://leetcode-cn.com/problems/battleships-in-a-board/solution/tong-guo-zhan-jian-tou-bu-pan-duan-by-powcai/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
