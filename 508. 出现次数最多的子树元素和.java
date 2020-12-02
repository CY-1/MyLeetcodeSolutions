/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<Integer,Integer> a;
    public int[] findFrequentTreeSum(TreeNode root) {
        if(root==null)return new int[]{};
        a=new HashMap();
        my(root);
        ArrayList<Integer> b=new ArrayList(a.keySet());
        Collections.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (a.get(o1)-a.get(o2))*-1;
            }
        });
        // System.out.println(a);
        // System.out.println(b);
        
        int current=a.get(b.get(0));
        // System.out.println(current);
        int length=1;
        for(int i=1;i<b.size();i++){
            if(a.get(b.get(i))==current){
                length++;
            }
        }
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            result[i]=b.get(i);
        }
        return result;

    }
    public int my(TreeNode root){
        if(root==null){
            return 0;
        }
        else{
            int result=my(root.left)+my(root.right)+root.val;
            a.put(result,a.getOrDefault(result,0)+1);
            return result;
        }

    }
}
