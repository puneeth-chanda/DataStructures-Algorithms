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
    int dia = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return dia;
        if(root.left!=null) diameterOfBinaryTree(root.left);
        if(diameter(root)>dia) dia = diameter(root);
        if(root.right!=null) diameterOfBinaryTree(root.right);
        return dia;
    }
    public int diameter(TreeNode root){
        if(root.left==null && root.right==null) return 0;
        else if(root.left==null) return maxDepth(root.right);
        else if(root.right==null) return maxDepth(root.left);
        else return (maxDepth(root.left)+maxDepth(root.right));
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        else{
            int ldepth = maxDepth(root.left);
            int rdepth = maxDepth(root.right);
            if(ldepth > rdepth) return ldepth+1;
            else return rdepth+1;
        }
    }
}