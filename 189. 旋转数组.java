class Solution {
    public void rotate(int[] nums, int k) {
        int current;
        if(nums.length==0){
            return ;
        }
        k=k%nums.length;
        for(int i=0;i<k;i++){
            current=nums[nums.length-1];
            for(int j=nums.length-1;j>0;j--){
                nums[j]=nums[j-1];
            }
            nums[0]=current;
        }
    }
}
