class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result=new int[nums.length];
        int[] my=nums.clone();
        Arrays.sort(my);
        int left,right,mid;
        for(int i=0;i<nums.length;i++){
            left=0;
            right=nums.length;
            mid=(left+right)/2;
            while(left<right){
                if(my[mid]<nums[i]){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
                mid=(left+right)/2;
            }
            result[i]=mid;
        }
        return result;
    }
}
