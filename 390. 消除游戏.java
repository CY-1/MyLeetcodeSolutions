class Solution {
    public int lastRemaining(int n) {
        return n==1 ? 1 : 2*(n/2+1-lastRemaining(n/2));
    }
}


// 自己写的又超时了。。。。
class Solution {
    public static void main(String[] args) {
        Solution a = new Solution();
        System.out.println(a.lastRemaining(2));

    }
    public void del_a(LinkedList<Integer> a){

        int size = a.size();
        for(int i=a.size()%2==0?1:0;i<size;i=i+2){
            a.remove(size-1-i);
        }
    }
    public void del_b(LinkedList<Integer> a){
        int size = a.size();
        for(int i=0;i<size;i+=2){
            a.remove(size-1-i);
        }
    }
    public int lastRemaining(int n) {
        LinkedList<Integer> list=new LinkedList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        while(list.size()!=1){
            del_a(list);
            if(list.size()==1)
                break;
            del_b(list);
        }
        return list.get(0);
    }
}
