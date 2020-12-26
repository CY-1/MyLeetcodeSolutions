class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0)return 0;
         int[][] a=new int[matrix.length][matrix[0].length];
         int b=0,result=0;
         for(int i=0;i<a.length;i++){
             for(int j=0;j<a[0].length;j++){
                if(matrix[i][j]=='1'){
                    a[i][j]=i>0?a[i-1][j]+1:1;
                }
             }
             for(int j=0;j<a[0].length;j++){
                 int index=j,h=a[i][j];
                 while(index<a[0].length&&a[i][index]!=0){
                     h=Math.min(h,a[i][index]);
                     result=Math.max(result,h*(index-j+1));
                     index++;
                 }
             }
         }
//        for(int i=0;i<a.length;i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j]+" ");
//            }
//            System.out.println();
//        }
         return result;

    }
}
