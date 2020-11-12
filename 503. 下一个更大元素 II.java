class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++)   {
            int j=i+1;
            j=j% nums.length;
            while (j!=i){
                if(nums[j]>nums[i]){
                    break;
                }
                j++;
                j=j% nums.length;
            }
            result[i]=i!=j?nums[j]:-1;
        }
        return result;
    }
}
