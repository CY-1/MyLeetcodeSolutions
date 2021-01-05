class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> result=new LinkedList<>();
        int current=0;
        for(int i=0;i<s.length();i=i+current){
            current=0;
            for(int j=i;j<s.length()&&s.charAt(i)==s.charAt(j);j++){
                current++;
            }
            LinkedList<Integer> a=new LinkedList<Integer>();
            if(current>=3){
                a.add(i);
            a.add(i+current-1);
            result.add(a);
            }
        }
        return result;
    }
}
