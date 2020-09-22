class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()==0){
            return true;
        }
        List<String> a=new ArrayList<>();
        Collections.addAll(a,
                ransomNote.split(""));
        List<String> b= new ArrayList<>();
        Collections.addAll(b,
                magazine.split(""));
        for (String i :
                a) {
            if (b.contains(i)) {
                b.remove(i);
            }
            else{
                return false;
            }

            }
        return true;
    }
}
