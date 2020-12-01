class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        int left=0,right=nums.length,mid;
        while(left<right){
            mid=(right+left)/2;
            if(nums[mid]<target)
                left=mid+1;
            else
                right=mid;
        }
        result[0]=left<nums.length&&nums[left]==target?left:-1;
        left=0;right=nums.length;
        while(left<right){
            mid=(right+left)/2;
            if(nums[mid]>target)
                right=mid;
            else
                left=mid+1;
        }
        result[1]=left-1>=0&&left-1<nums.length&&nums[left-1]==target?left-1:-1;
        return result;
    }
}
