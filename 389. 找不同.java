class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> a=new HashMap<>();
        for(int i=0;i<t.length();i++){
            a.put(t.charAt(i),a.getOrDefault(t.charAt(i),0)+1);

        }
        for(int i=0;i<s.length();i++){
            a.replace(s.charAt(i),a.get(s.charAt(i))-1);
        }
        for (Character i:
             a.keySet()) {
            if(a.get(i)==1){
                return i;
            }
        }
        
        return '1';
    }
}
