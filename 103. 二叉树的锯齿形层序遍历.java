class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> a=new LinkedList();
        if(root==null){
            return a;
        }
        
        List<Integer> b;
        Deque<TreeNode> c=new LinkedList<>();
        c.add(root);
        boolean flag=true;
        while(c.size()>0){
            b=new LinkedList();
            int size = c.size();
            for(int i=0;i<size;i++){
                TreeNode pop = c.poll();
                if(flag){
                    b.add(pop.val);
                }else{
                    b.add(0, pop.val);
                }
                if(pop.left!=null){
                    c.add(pop.left);
                }
                if(pop.right!=null){
                    c.add(pop.right);
                }
            }
            flag=!flag;
            a.add(b);
        }
    return a;
    }
}
