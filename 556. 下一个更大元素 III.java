class Solution {
    public int nextGreaterElement(int n) {
        char[] sb=String.valueOf(n).toCharArray();
        int result=Integer.MAX_VALUE;
        //尝试前后位切换 取最小值
        for(int x=1;x<sb.length;x++){
        
            for(int i=sb.length-1;i>0;i--){
                if(i-x>=0&&sb[i]>sb[i-x]){
                    char a=sb[i];
                    sb[i]=sb[i-x];
                    sb[i-x]=a;
                    Arrays.sort(sb,i-x+1,sb.length);
                    result= (int) Math.min(Double.valueOf(String.valueOf(sb)),result);
                }
            }
            sb=String.valueOf(n).toCharArray();
        }
        return result!=Integer.MAX_VALUE?result:-1;
    }
}
