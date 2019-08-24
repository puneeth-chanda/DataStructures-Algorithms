class Solution {
    int no=0;
    public int maxDepth(TreeNode root) {
        if(isLeaf(root)){
            return 0;
        }
        else if(hasRightChild(root)){
            no++;
            return maxDepth(root.right);
        }
        else if(hasLeftChild(root)){
            no++;
            return maxDepth(root.left);
        }
        return no;
    }
    public boolean hasRightChild(TreeNode node){
        if(node.left==null && node.right!=null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean hasLeftChild(TreeNode node){
        if(node.right==null&& node.left==null){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isLeaf(TreeNode node){
        if(node.left==null && node.right==null){
            return true;
        }
    }
}
