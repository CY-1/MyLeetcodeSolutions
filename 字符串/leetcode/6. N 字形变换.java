class Solution {
    public String convert(String s, int numRows) {
        //直接模拟 
        LinkedList<LinkedList<Character>> list = new LinkedList<>();
        for (int i = 0; i < numRows; i++) {
                list.add(new LinkedList<Character>());
        }
        int index=0;
        while (index < s.length()) {
            //先从上到下
            for (int i = 0; i < numRows && index < s.length(); i++) {
                LinkedList<Character> characters = list.get(i);
                characters.add(s.charAt(index++));
            }
            //从倒数第二行 到整数第二行 然后循环
            for(int i=numRows-2;i>0&&index<s.length();i--){
                LinkedList<Character> characters = list.get(i);
                characters.add(s.charAt(index++));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<numRows;i++){
            LinkedList<Character> current = list.get(i);
            for(int j=0;j<current.size();j++){
                sb.append(current.get(j));
            }
        }
        return sb.toString();
    }
}

