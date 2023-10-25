

public  class kmp {
    public static void main(String[] args) {
        System.out.println(new kmp().strStr("a","ABABABCAA"));
    }

    public int strStr(String ss, String pp) {
        int[] next=getNext(pp);
        char[] s = ss.toCharArray();
        char[] p = pp.toCharArray();
        int i=0,j=0;
        for(;i<ss.length();){
            if(j==p.length)
                return i-j;
            if(s[i]==p[j]){
                j++;
                i++;
            }else{
                if(j==0)i++;
                else{
                    j=next[j-1];
                }
            }

        }
        return j==p.length?i-j:-1;
    }
    public int[] getNext(String s){
        char[] p = s.toCharArray();
        int[] next=new int[s.length()];
        next[0]=0;
        for(int i=1,j=0;i<p.length;i++){
            while(j>0&&p[i]!=p[j]){
                j=next[j-1];
            }
            if(p[i]==p[j]){
                j++;
            }
            next[i]=j;
        }
        return next;
    }

}



class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                '}';
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

