class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer a=new StringBuffer();
        StringBuffer b=new StringBuffer();
        for(int i=0;i<word1.length;i++){
            a.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            b.append(word2[i]);
        }
        // System.out.println(a);
        // System.out.println(b);
        return a.toString().equals(b.toString());
    }
}
