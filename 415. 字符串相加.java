class Solution {
    public String addStrings(String num1, String num2) {
        StringBuffer result=new StringBuffer();
        int yushu=0;
        StringBuffer current=new StringBuffer();
        if(num1.length()>num2.length()){

            for(int i=num2.length();i<num1.length();i++){
                current.append(0);
            }
            current.append(num2);
            num2=current.toString();
        }else{

            for(int i=num1.length();i<num2.length();i++){
                current.append(0);
            }
            current.append(num1);
            num1=current.toString();
        }
        for(int i=1;i<=Math.min(num1.length(),num2.length());i++){
            int a =  Integer.parseInt(String.valueOf(num1.charAt(num1.length()-i))) + Integer.parseInt(String.valueOf(num2.charAt(num2.length()-i)))+yushu;
            yushu=a/10;
            result.append(a-yushu*10);
        }
        if(yushu!=0)result.append(yushu);
        return result.reverse().toString();
    }
}
