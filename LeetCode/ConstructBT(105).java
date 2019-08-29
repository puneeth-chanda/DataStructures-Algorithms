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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> inorderMap = new HashMap();
        for(int i = 0;i < inorder.length; i++)
            inorderMap.put(inorder[i], i);
        return buildTree(preorder, 0, preorder.length - 1, inorderMap, 0, inorder.length - 1);
    }
    private TreeNode buildTree(int[] preorder, int prestart, int preend, Map<Integer, Integer>inorderMap, int instart, int inend){
        if(prestart > preend || instart > inend)
            return null;
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = inorderMap.get(preorder[prestart]);
        int numsleft = inroot - instart;
        root.left = buildTree(preorder, prestart + 1, prestart + numsleft, inorderMap, instart, inroot - 1);
		root.right = buildTree(preorder, prestart + numsleft + 1, preend, inorderMap, inroot + 1, inend);
		return root;
    }
}