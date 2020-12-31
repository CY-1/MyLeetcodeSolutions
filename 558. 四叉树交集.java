/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    public Node() {}

    public Node(boolean _val,boolean _isLeaf,Node _topLeft,Node _topRight,Node _bottomLeft,Node _bottomRight) {
        val = _val;
        isLeaf = _isLeaf;
        topLeft = _topLeft;
        topRight = _topRight;
        bottomLeft = _bottomLeft;
        bottomRight = _bottomRight;
    }
};
*/

class Solution {
public Node intersect(Node quadTree1, Node quadTree2) {
    return Order(quadTree1,quadTree2);
}


//返回两个树合并之后的四叉树
public Node Order(Node quadTree1 ,  Node quadTree2){

    //如果有一个叶子节点 递归终止
    //当叶子节点为True 合并为叶子节点 否则 合并结果为非叶子节点的节点(对方节点)
    if(quadTree1.isLeaf){
        if(quadTree1.val){
            return quadTree1;
        }
        return quadTree2;
    }else if(quadTree2.isLeaf){
        if(quadTree2.val){
            return quadTree2;
        }
        return quadTree1;
    }

    //合并之后的各个分支
    Node topLeft = Order(quadTree1.topLeft, quadTree2.topLeft);
    Node topRight = Order(quadTree1.topRight, quadTree2.topRight);
    Node bottomLeft = Order(quadTree1.bottomLeft, quadTree2.bottomLeft);
    Node bottomRight = Order(quadTree1.bottomRight, quadTree2.bottomRight);

    //因为可能存在返回的都叶子节点 因此要判断一下返回的节点是否全部叶子节点 并且 都为 True 或者 False 这样要合并为一个大的节点
    if(topLeft.isLeaf && topRight.isLeaf && bottomLeft.isLeaf && bottomRight.isLeaf
        && topLeft.val == topRight.val && topLeft.val == bottomLeft.val && topLeft.val == bottomRight.val){
        return new Node(topLeft.val,true,null,null,null,null);
    }
    //否则的话保留各个分支节点 不进行合并
    return new Node(false,false,topLeft,topRight,bottomLeft,bottomRight);


}

}
