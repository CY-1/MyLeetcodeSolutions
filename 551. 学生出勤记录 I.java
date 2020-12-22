class Solution {
    public boolean checkRecord(String s) {
        int[] a=new int[3];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a[0]++;
            }
            else if(s.charAt(i)=='L'){
                if(i>1&&s.charAt(i-1)=='L'&&s.charAt(i-2)=='L'){
                    return false;
                }
            }
        }
        return a[0]<=1;
    }
}
