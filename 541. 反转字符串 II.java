class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer a=new StringBuffer();
        int index=0;
        StringBuffer b;
        while(index<s.length()){
            if(s.length()-1-index<k){
                b=new StringBuffer();
                while(s.length()!=index){
                    b.append(s.charAt(index));
                    index++;
                }
                a.append(b.reverse());
                break;
            }
            b=new StringBuffer();
            for(int i=0;i<k;i++){
                b.append(s.charAt(index));
                index++;
            }
            a.append(b.reverse());
            for(int i=0;i<k&&index<s.length();i++){
                a.append(s.charAt(index));
                index++;
            }
        }
        return a.toString();
    }
}
