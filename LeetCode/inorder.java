class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> ret = new ArrayList <> ();
        helper(root, ret);
        return ret;
    }

    public void helper(TreeNode root, List <Integer> ret) {
        if (root != null) {
            if (root.left != null) {
                helper(root.left, ret);
            }
            ret.add(root.val);
            if (root.right != null) {
                helper(root.right, ret);
            }
        }
    }
}