class Solution {
    Set<List<Integer>> a;
    public List<List<Integer>> findSubsequences(int[] nums) {
        a=new HashSet<List<Integer>>();
        my(nums,0,new LinkedList());
        List<List<Integer>> b=new LinkedList();
        for(List<Integer> i: a){
            b.add(i);
        }
        return b;
    }
    public void my(int[] nums,int index,List<Integer> current) {
        if(current.size()>=2){
            a.add(current);
        }
        for(int i=index;i<nums.length;i++){
            if(current.size()==0||nums[i]>=current.get(current.size()-1)){
                if(index>0&&nums[i]!=nums[i-1]) {
                    List<Integer> copy = new ArrayList<>(current);
                    my(nums, i + 1, copy);
                    copy.add(nums[i]);
                    my(nums, i + 1, copy);
                }
                else{
                    List<Integer> copy = new ArrayList<>(current);
                    copy.add(nums[i]);
                    my(nums, i + 1, copy);
                }
            }
        }
    }
}
