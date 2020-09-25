class Solution {
    public List<Integer> lexicalOrder(int n) {
        ArrayList<String> a=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            a.add(String.valueOf(i));
        }
        Collections.sort(a);
        ArrayList<Integer> b=new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            b.add(Integer.valueOf(a.get(i)));
        }
        return b;
    }
}
