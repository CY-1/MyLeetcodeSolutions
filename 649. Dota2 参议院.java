class Solution {
        public String predictPartyVictory(String senate) {
            int[] flag=new int[senate.length()];
            int index=0;
            int result1=0;
            int result2=0;
            
            for(int i=0;i<flag.length;i++){
                if(senate.charAt(i)=='R'){
                    result1+=1;
                }
                else if(senate.charAt(i)=='D'){
                    result2+=1;
                }
            }
                        if(result1==0){
                                return "Dire";
                             }
                                                         if(result2==0){
                                return "Radiant";
                            }
            while(true){
                for(int i=index+1;i!=index&&flag[index]!=1;){
                    i=i%(flag.length);
                    if(senate.charAt(i)!=senate.charAt(index)&&flag[i]!=1){
                        flag[i]=1;
                        if(senate.charAt(i)=='R'){
                            result1--;
                            if(result1==0){
                                return "Dire";
                             }
                        }
                        else{
                            result2--;
                            if(result2==0){
                                return "Radiant";
                            }
                        }
                        break;
                    }
                    i++;
                }
                index++;
                index=index%(flag.length);
            }
        }
}
