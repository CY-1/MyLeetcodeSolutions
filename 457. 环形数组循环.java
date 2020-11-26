class Solution {
    public boolean circularArrayLoop(int[] nums) {
        int flag,begin,next,length;
        for(int i=0;i<nums.length;i++){
            flag=nums[i]>0?1:-1;
            begin=i;
            length=0;
            next=(begin+nums[begin])>0?(begin+nums[begin])%nums.length:((begin+nums[begin])%nums.length+ nums.length)%nums.length;
            length=length+Math.abs(next-begin);
            while(begin!=next&&flag*nums[next]>0){
                int current;

                current=(next+nums[next])>0?(next+nums[next])%nums.length:((next+nums[next])%nums.length+ nums.length)%nums.length;
                if(((next+nums[next])> nums.length||(next+nums[next])<0)&&current>begin){
                    break;
                }
                if(current==next){
                    break;
                }
                else{
                    length=length+Math.abs(next-current);
                    next=current;
                }

            }
            if(begin==next&&length>1)return true;
        }
        return false;
    }
}
