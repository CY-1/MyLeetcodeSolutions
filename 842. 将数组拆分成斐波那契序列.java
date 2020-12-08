class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        char[] chars = S.toCharArray();
        int x;
        for(int i=0;i<S.length()-2;i++){
            StringBuffer current=new StringBuffer();
            x=0;
            while(x<=i){
                current.append(chars[x++]);
            }
            List<Integer> a=new ArrayList<>();
            if(Double.parseDouble(current.toString())>Integer.MAX_VALUE||(current.charAt(0)=='0'&&Integer.parseInt(current.toString())!=0)){
                break;
            }

            a.add(Integer.parseInt(current.toString()));
            for(int j=i+1;j<S.length();j++){
                x=i+1;
                current=new StringBuffer();
                while(x<=j){
                    current.append(chars[x++]);
                }
                if(Double.parseDouble(current.toString())>Integer.MAX_VALUE||(current.charAt(0)=='0'&&Integer.parseInt(current.toString())!=0)){
                    break;
                }
                a.add(Integer.parseInt(current.toString()));
                List<Integer> my = my(chars, a, j + 1);
                if(my!=null){
                    return my;
                }
                else{
                    while(a.size()>1){
                        a.remove(a.size()-1);
                    }
                }
            }
        }
        return new ArrayList<>();
    }
    public  List<Integer> my(char[] chars,List<Integer> a,int index){
        if(index>=chars.length){
            if(a.size()>2)
                return a;
            else
                return null;
        }
        StringBuffer current=new StringBuffer();
        for(int i=index;i<chars.length;i++){
            current.append(chars[i]);
            if(Double.parseDouble(current.toString())>Integer.MAX_VALUE||(current.charAt(0)=='0'&&Integer.parseInt(current.toString())!=0)){
                break;
            }
            if(Integer.parseInt(current.toString())==a.get(a.size()-1)+a.get(a.size()-2)){
                a.add(Integer.parseInt(current.toString()));
                return my(chars,a,i+1);
            }
        }
        return null;
    }
}
