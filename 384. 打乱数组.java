class Solution {
    int[] a;
    Random bb;
    public Solution(int[] nums) {
        this.a=nums;
        bb=new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return a;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] aa=new int[this.a.length];
        int[] bb=this.a.clone();
        int current;
        for(int i=0;i<aa.length;i++){
            int i1 = i + (int) (Math.random() * (aa.length - i));
            aa[i]=bb[i1];
            current=bb[i1];
            bb[i1]=bb[i];
            bb[i]=current;
        }
        return aa;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
