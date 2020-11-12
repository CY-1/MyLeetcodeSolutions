class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] A1=new int[A.length];
        int a=0,b=1;
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                A1[a]=A[i];
                a=a+2;
            }
            else{
                A1[b]=A[i];
                b=b+2;
            }
        }
        return A1;
    }
}
