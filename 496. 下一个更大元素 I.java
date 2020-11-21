class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        HashMap<Integer,Integer> a=new HashMap();
        for(int i=0;i<nums2.length;i++){
            a.put(nums2[i],i);
        }
        for(int i=0;i<nums1.length;i++){
            int j;
            for(j=a.get(nums1[i]);j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i]){
                    result[i]=nums2[j];
                    break;
                }
            }
            result[i]=j==nums2.length?-1:result[i];
        }
        return result;
    }
}
