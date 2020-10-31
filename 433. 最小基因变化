class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int result=my(start,end,bank,0);
        return result==Integer.MAX_VALUE?-1:result;
    }

    public int my(String start,String end,String[] bank,int times){
        int result=Integer.MAX_VALUE;
        if(start.equals(end)){
            return times;
        }
        else{
            for(int i=0;i<bank.length;i++){
                if(check(bank[i],start)){
                    String a=bank[i];
                    bank[i]="";
                    result=Math.min(my(a,end,bank,times+1),result);
                    bank[i]=a;
                }
            }
            return result;
        }
    }
    public boolean check(String a, String b){
        int c=0;
        if(a.equals("") ||b.equals("")){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i)){
                c++;
            }
        }
        return c==1;
    }
    
}
