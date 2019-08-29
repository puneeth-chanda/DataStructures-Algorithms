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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode fnl = new TreeNode(0);
            return maker(nums, 0, nums.length-1);
    }
    public TreeNode maker(int[] a, int low, int high){
        if(low>high)
            return null;
        int mid = low + (high - low)/2;
        TreeNode root = new TreeNode(a[mid]);
        root.left = maker(a, low, mid-1);
        root.right = maker(a, mid+1, high);
        return root;
    }
}