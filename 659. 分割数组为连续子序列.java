class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer,Integer> nc=new HashMap<>();
        HashMap<Integer,Integer> tail=new HashMap<>();
        for(int i:nums){
            nc.put(i,nc.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(nc.get(i)==0) continue;
            else if(nc.get(i)>0&&tail.getOrDefault(i-1,0)>0){
                nc.put(i,nc.get(i)-1);
                tail.put(i-1,tail.getOrDefault(i-1,0)-1);
                tail.put(i,tail.getOrDefault(i,0)+1);
            }
            else if(nc.get(i)>0&&nc.getOrDefault(i+1,0)>0&&nc.getOrDefault(i+2,0)>0){
                nc.put(i,nc.getOrDefault(i,0)-1);
                nc.put(i+1,nc.get(i+1)-1);
                nc.put(i+2,nc.get(i+2)-1);
                tail.put(i+2,tail.getOrDefault(i+2,0)+1);

            }
            else {
                return false;
            }
        }
        return true;
    }
        
}
