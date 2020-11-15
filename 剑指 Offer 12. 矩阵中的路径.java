class Solution {
    int[][] visited;
    public boolean exist(char[][] board, String word) {
        if(word.equals("")){
            return true;
        }
        this.visited=new int[board.length][board[0].length];
        boolean result=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0))
                                {
                    this.visited[i][j]=1;
                    result=result||my(board,word,1,i,j);
                    this.visited[i][j]=0;
                }
            }
        }
        return result;
    }
    public boolean my(char[][] board,String word,int index,int x,int y){
        if(index==word.length()){
            return true;
        }
        boolean flag=false;
        if(x+1<board.length&&visited[x+1][y]==0&&board[x+1][y]==word.charAt(index)){
            visited[x+1][y]=1;
            flag=flag||my(board,word,index+1,x+1,y);
            visited[x+1][y]=0;
        }
        if(flag==false&&y+1<board[0].length&&visited[x][y+1]==0&&board[x][y+1]==word.charAt(index)){
            visited[x][y+1]=1;
            flag=flag||my(board,word,index+1,x,y+1);
            visited[x][y+1]=0;
        }
        if(flag==false&&x-1>=0&&visited[x-1][y]==0&&board[x-1][y]==word.charAt(index)){
            visited[x-1][y]=1;
            flag=flag||my(board,word,index+1,x-1,y);
            visited[x-1][y]=0;
        }
        if(flag==false&&y-1>=0&&visited[x][y-1]==0&&board[x][y-1]==word.charAt(index)){
            visited[x][y-1]=1;
            flag=flag||my(board,word,index+1,x,y-1);
            visited[x][y-1]=0;
        }
        return flag;
    }
}
