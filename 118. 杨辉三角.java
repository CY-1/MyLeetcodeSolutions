class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList();
        if(numRows==0) return result;
        List<Integer> a=new ArrayList();
        a.add(1);
        result.add(a);
        if(numRows==1) return result;
        a=new ArrayList();
        a.add(1);
        a.add(1);
        result.add(a);
        int current=0;
        for(int i=2;i<numRows;i++){
            a=new ArrayList();
            a.add(1);
            for(int j=1;j<result.get(i-1).size();j++){
                current=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                a.add(current);
            }
            a.add(1);
            result.add(a);
        }
        return result;
    }
}
