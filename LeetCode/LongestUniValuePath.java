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
    public int longestUnivaluePath(TreeNode root) {
        int[] result = new int[1];
        if (root != null) {
            afs(root, result);
        }
        return result[0];
    }
    private int afs(TreeNode root, int[] result){
        int leftPath = root.left == null ? 0 : afs(root.left, result);
        int rightPath = root.right == null ? 0 : afs(root.right, result);
        int leftResult = (root.left != null && root.left.val == root.val) ? leftPath + 1 : 0;
        int rightResult = (root.right != null && root.right.val == root.val) ? rightPath + 1 : 0;
        result[0] = Math.max(result[0], leftResult + rightResult);
        return Math.max(leftResult, rightResult);
    }
}