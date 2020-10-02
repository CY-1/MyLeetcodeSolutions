class Solution {
    public int numJewelsInStones(String J, String S) {
                int result=0;
        for (String i:S.split("")){
            if(J.contains(i)){
                result+=1;
            }
        }
        return result;
    }
}
