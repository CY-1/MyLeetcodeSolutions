class Solution {
    public int arrayNesting(int[] nums) {
        LinkedList<Integer> a;
        int result=0;
        int[] flag=new int[nums.length];
        int length;
        for(int i=0;i<nums.length;i++){
            a=new LinkedList<>();
            a.add(nums[i]);
            length=1;
            while(!a.contains(nums[a.peekLast()])){
                if(flag[nums[a.peekLast()]]!=0){
                    length=flag[nums[a.peekLast()]];
                    break;
                }
                a.add(nums[a.peekLast()]);
                length++;

            }
            flag[i]=length;
            result=Math.max(result,length);
        }
        return result;
    }
}
