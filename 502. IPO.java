class Solution {
    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        int[] flag=new int[Capital.length];
        int[] new_p_c;
        LinkedList<int[]> a=new LinkedList<>();
        for(int i=0;i<Profits.length;i++){
            new_p_c=new int[2];
            new_p_c[0]=Profits[i];
            new_p_c[1]=Capital[i];
            a.add(new_p_c);
        }
        Collections.sort(a, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return -1*(o1[0]-o2[0]);
            }
        });
        int profits=0;
        int max_index=-1;
        int i;
        while(k!=0){
            profits=0;
            max_index=-1;
            for(i=0;i<a.size();i++){
                if(a.get(i)[1]<=W&&a.get(i)[0]>profits){
                    profits=a.get(i)[0];
                    max_index=i;
                    break;
                }
            }
            W+=profits;
            if(max_index==-1){
                break;
            }
            a.remove(i);
            k--;
        }
        return W;
    }
}
