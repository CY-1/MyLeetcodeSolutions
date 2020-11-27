class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int mid,mid2;
        mid=nums.length/2;
        int result=0;
        for(int i=0;i<nums.length;i++){
            result=Math.abs(nums[mid]-nums[i])+result;
        }
        int result2=0;
        if(nums.length%2!=0){
            for(int i=0;i<nums.length;i++){
                result2=Math.abs(nums[mid]-nums[i])+result2;
            }
        }
        return nums.length%2!=0?Math.min(result,result2):result;
    }
}
