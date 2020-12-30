class Solution {
    public int lastStoneWeight(int[] stones) {
        LinkedList<Integer> a=new LinkedList<>();
        if(stones.length==0){
            return 0;
        }
        for(var i:stones){
            a.add(i);
        }
        while(a.size()!=1){
            Collections.sort(a);
            Integer pop = a.pollLast();
            Integer pop1 = a.pollLast();
            a.add(pop-pop1);
        }
        return a.get(0);
    }
}
