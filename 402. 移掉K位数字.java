class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack=new Stack<>();
        int index=0;
        if(k>=num.length()){
            return "0";
        }
        int x=k;
        while(index<num.length()){

            while(k>0&&!stack.isEmpty()&&stack.peek()>num.charAt(index)){
                stack.pop();
                k-=1;
            }
            stack.push(num.charAt(index));
            index++;
        }
        StringBuffer result=new StringBuffer();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        result.reverse();
        result.delete(num.length()-x,result.length());
        String string = result.toString().replaceAll("^[0]+", "");

        return string.length()==0?"0":string;
    }
}
