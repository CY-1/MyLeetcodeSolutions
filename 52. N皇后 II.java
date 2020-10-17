class Solution {
    int result=0;
    int n=0;
    int[][] a;
    int[] flag_x;
    int[] flag_y;
    public int totalNQueens(int n) {
        this.n=n;
        this.a=new int[n][n];
        this.flag_x=new int[n];
        this.flag_y=new int[n];
        my(0);
        return this.result;
    }
    public void my(int total){
        if(total==n){
            this.result+=1;
        }
        else{
            for(int i=0;i<a[0].length;i++){
                if(check(total,i)){
                    a[total][i]=1;
                    this.flag_y[total]=1;
                    this.flag_x[i]=1;
                    my(total+1);
                    this.flag_y[total]=0;
                    this.flag_x[i]=0;
                    a[total][i]=0;
                }
            }
        }
    }
    public boolean check(int i,int j){
        if(this.flag_x[j]==1){
            return false;
        }
        if(this.flag_y[i]==1){
            return false;
        }
        for(int x=0;x<a.length;x++){
            if(i-x>=0&&j-x>=0&&a[i-x][j-x]==1){
                return false;
            }
            if(i-x>=0&&j+x<a[0].length&&a[i-x][j+x]==1){
                return false;
            }
        }
        return true;
    }
}
