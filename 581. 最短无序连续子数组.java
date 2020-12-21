class Solution {
    public int findUnsortedSubarray(int[] nums) {
        HashMap<Integer,Integer> a=new HashMap();
        for(int i=0;i<nums.length;i++){
            a.put(i,nums[i]);
        }
        Arrays.sort(nums);
        int left=0;
        for(int i=0;i<nums.length;i++){
            if(a.get(left)!=nums[i]){
                break;
            }
            else{
                left++;
            }
        }
        int right=nums.length-1;
        for(int i=nums.length-1;i>-1;i--){
            if(a.get(right)!=nums[i]){
                break;
            }
            else{
                right--;
            }
        }
        return Math.max(0,right-left+1);
    }
}
