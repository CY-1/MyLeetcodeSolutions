class Solution {
    public void reverseString(char[] s) {
            char a;
            if(s.length<=1){
                return;
            }
            int left=0;
            int right=s.length-1;
            while(left<=right){
                a=s[left];
                s[left]=s[right];
                s[right]=a;
                left++;
                right--;
            }
    }
}
