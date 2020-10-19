class Solution {
    public boolean backspaceCompare(String S, String T) {
        StringBuffer a=new StringBuffer();
        StringBuffer b=new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if(S.charAt(i)!='#'){
                a.append(S.charAt(i));
            }
            else {
                if (a.length() > 0)
                {

                    a.deleteCharAt(a.length() - 1);

                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if(T.charAt(i)!='#'){
                b.append(T.charAt(i));
            }
            else {
                if (b.length() > 0)
                {
                    b.deleteCharAt(b.length() - 1);
                }

            }
        }

        return a.toString().equals(b.toString());
    }
}
