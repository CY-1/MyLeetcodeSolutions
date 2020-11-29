class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuffer a=new StringBuffer();

        for(int i=0;i<s.length()/2;i++){
            a.append(s.charAt(i));
            StringBuffer b=new StringBuffer();
            while (b.length()<s.length()){
                b.append(a);
            }
            if(b.toString().equals(s)){
                return true;
            }

        }
        return false;
    }
}
