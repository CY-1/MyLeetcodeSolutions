class Solution {
    public int candy(int[] ratings) {
        //a中存储rating中对应的下标和得分
        int[][] a=new int[ratings.length][2];
        for(int i=0;i<ratings.length;i++){
            a[i][0]=i;
            a[i][1]=ratings[i];
        }
        //按照得分对下标排序
        Arrays.sort(a,(x,y)->{return x[1]-y[1];});

        //tang是对应下标应该得到的糖数目
        int[] tang=new int[ratings.length];

        //a[i][0]是ratings对应的下标 a[i][1]表示对应的rating
        for(int i=0;i<ratings.length;i++){
            //tang[a[i][0]]应该取左右最大值+1
            tang[a[i][0]]=Math.max(a[i][0]-1>=0?tang[a[i][0]-1]:0,a[i][0]+1<ratings.length?tang[a[i][0]+1]:0)+1;
            //left表示当前下标的左边 right表示当前下标的右边
            int left=a[i][0]-1>=0?ratings[a[i][0]-1]:a[i][1];
            int right=a[i][0]+1<ratings.length?ratings[a[i][0]+1]:a[i][1];
            if(Math.min(left,right)>=a[i][1]){
                //左右最小值大于a[i][1] 应该为1
                tang[a[i][0]]=1;
            }
            else if(left==a[i][1]&&right<a[i][1]){
                //左边和a[i][1]得分相同 应该取右边值+1
                tang[a[i][0]]=tang[a[i][0]+1]+1;
            }           
            else if(right==a[i][1]&&left<a[i][1]){
                //右边和a[i][1]得分相同 应该取左边值+1
                tang[a[i][0]]=tang[a[i][0]-1]+1;
            }
        }
        // 遍历tang数组 求和
        int result=0;
        for(int i=0;i<tang.length;i++){
            result=result+tang[i];
        }
        return result;
    }
}
