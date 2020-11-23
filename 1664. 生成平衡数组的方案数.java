class Solution {
    public int waysToMakeFair(int[] nums) {
        if(nums.length==1){
return 1;
        }
        int[] a1=new int[nums.length];
        int[] a2=new int[nums.length];
        a1[0]=nums[0];
        a2[1]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(i%2==0){
                a1[i]=nums[i]+a1[i-2];
            }
            else{
                a2[i]=nums[i]+a2[i-2];
            }

        }
        int sum1;
        int sum2;
        int result=0;
        sum1=a2[a2.length%2!=0?a2.length-2:a2.length-1];
        sum2=a1[a1.length%2==0?a2.length-2:a2.length-1]-nums[0];
        if(sum1==sum2){
            result++;
        }
        
        for(int i=1;i<nums.length;i++){
            if(i%2==0){
                sum1=a1[i]-nums[i];
                sum2=a2[i-1];
                sum1=sum1+a2[a2.length%2==0?a2.length-1:a2.length-2]-a2[i-1];
                sum2=sum2+a1[a1.length%2==0?a1.length-2:a1.length-1]-a1[i];
            }
            else{
                sum1=a1[i-1];
                sum2=a2[i]-nums[i];
                sum1=sum1+a2[a2.length%2==0?a2.length-1:a2.length-2]-a2[i];
                sum2=sum2+a1[a1.length%2==0?a1.length-2:a1.length-1]-a1[i-1];
            }
            // System.out.println(sum1+" "+sum2);
            if(sum1==sum2){
                result++;
            }
        }
        return result;
    }
}
