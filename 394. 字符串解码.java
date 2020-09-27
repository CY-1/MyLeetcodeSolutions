class Solution {
    public String decodeString(String s) {
        Stack<Integer> number_stack=new Stack<>();
        Stack<Character> word_stack=new Stack<>();
       StringBuffer result=new StringBuffer();
       StringBuffer number=new StringBuffer();
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)<='9'&&s.charAt(i)>='0'){
               number.append(s.charAt(i));
               continue;
           }
           if(((s.charAt(i)<='z'&&s.charAt(i)>='a')||(s.charAt(i)<='Z'&&s.charAt(i)>='A'))||s.charAt(i)=='['){
               word_stack.push(s.charAt(i));
               if(number.length()>0)
               {
                   number_stack.push(Integer.valueOf(number.toString()));
                   number.delete(0,number.length());
               }
               continue;
           }
           if(s.charAt(i)==']'){
               StringBuffer word=new StringBuffer();
               while(word_stack.peek()!='['){
                   word.append(word_stack.pop());
               }
               word_stack.pop();
               Integer integer = number_stack.pop();
               String b=new String(word);
               for(int j=0;j<integer-1;j++){
                   word.append(b);
               }
               if(!word_stack.isEmpty()){
                   StringBuffer reverse = word.reverse();
                   for(int x=0;x<reverse.length();x++){
                       word_stack.push(reverse.charAt(x));
                   }
               }
               else{
                   result.append(word.reverse());
               }
           }

       }
        Object[] objects = word_stack.toArray();
        for(int i=0;i<objects.length;i++){
            result.append(objects[i]);
        }
       return result.toString();
    }
}
