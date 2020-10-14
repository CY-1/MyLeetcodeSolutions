class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int total=0;
        for (int i = 0; i < A.length; i++) {
            for(int j=2;i+j<A.length;j++){
                if(my(A,i,i+j)){
                    total+=1;
                }
                else{
                    break;
                }
            }
        }
        return total;
    }
    public boolean my(int[] A,int begin,int end){

        for(int i=begin+2;i<=end;i++){
        if(A[i]-A[i-1]==A[i-1]-A[i-2]){
            continue;
        }
        else{
            return false;
        }
    }
    return true;
    }
}
