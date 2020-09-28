class Solution {
    public int integerReplacement(int n) {
        return my(n,0);
    }
    HashMap<Integer,Integer> a=new HashMap<>();
    public int my(int n,int total){
        if(n==1){
            return 0;
        }
        if(n == Integer.MAX_VALUE) return 32;
        if(a.containsKey(n)){
            return a.get(n);
        }
        if(n%2==0){
            total=total+my(n/2,0)+1;
        }
        else{
            total=total+Math.min(my(n+1,0),my(n-1,0))+1;
        }
        a.put(n,total);
        return total;
    }
}

