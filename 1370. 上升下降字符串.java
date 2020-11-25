

class Solution {

    int[] flag;
    public String sortString(String s) {
        StringBuffer result=new StringBuffer();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        flag=new int[chars.length];
        int i=0;
        char current;
        while(i<chars.length){
            current=0;
            for(int x=0;x<chars.length;x++){
                if(flag[x]!=1&&chars[x]>current){
                    result.append(chars[x]);
                    flag[x]=1;
                    i++;
                    current=chars[x];
                }
            }
            current=126;
            for(int x=chars.length-1;x>=0;x--){

                if(flag[x]!=1&&chars[x]<current){
                    result.append(chars[x]);
                    flag[x]=1;
                    i++;
                    current=chars[x];
                }
            }
        }
        return result.toString();
    }
}
