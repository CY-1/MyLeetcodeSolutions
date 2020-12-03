class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> a=new HashMap();
        List<Integer> b=new ArrayList();
        for(int i=0;i<p.length();i++){
            a.put(p.charAt(i),a.getOrDefault(p.charAt(i),0)+1);
        }
        // System.out.println(a);
        for(int i=0;i<s.length();i++){
            if(i<p.length()){
                if(a.containsKey(s.charAt(i))){
                    a.put(s.charAt(i),a.get(s.charAt(i))-1);
                }
            }
            else{
                if(a.containsKey(s.charAt(i-p.length()))){
                    a.put(s.charAt(i-p.length()),a.getOrDefault(s.charAt(i-p.length()),0)+1);
                } 
                if(a.containsKey(s.charAt(i))){
                    a.put(s.charAt(i),a.getOrDefault(s.charAt(i),0)-1);
                } 
            }
            // System.out.println(a);
            int sum=0;
            for(int x:a.values()){
                sum+=x>=0?x:0;
            }
            if(sum==0){
                b.add(i-p.length()+1);
            }
        }
        return b;
    }
}
