class Solution {
    public int fib(int N) {

        int[] a=new int[]{0,1};
        if(N<a.length){
            return a[N];
        }
        int result=0;
        for(int i=1;i<N;i++){
            result=a[0]+a[1];
            a[0]=a[1];
            a[1]=result;
        }
        return result;
    }
}
